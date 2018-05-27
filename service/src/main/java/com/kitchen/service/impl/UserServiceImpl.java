package com.kitchen.service.impl;

import com.kitchen.mapper.UserMapper;
import com.kitchen.pojo.User;
import com.kitchen.pojo.UserExample;
import com.kitchen.service.UserService;
import com.kitchen.service.jedis.JedisClient;
import com.kitchen.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author chen
 * @date 2018/5/25 14:56
 */
@Service
public class UserServiceImpl implements UserService {
	private final UserMapper userMapper;
	private final JedisClient jedisClient;
	@Value("${PREFIX_USER_SESSION}")
	private String USER_SESSION;
	@Value("${SESSION_EXPIRE}")
	private Integer SESSION_EXPIRE;

	@Autowired
	public UserServiceImpl(UserMapper userMapper, JedisClient jedisClient) {
		this.userMapper = userMapper;
		this.jedisClient = jedisClient;
	}

	/**
	 * 检查 username 是否可用
	 *
	 * @param username 待检查的 username
	 * @return true 即可用
	 */
	@Override
	public boolean checkName(String username) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		return userMapper.countByExample(example) == 0;
	}

	/**
	 * 用户注册
	 * 通过DigestUtils.md5DigestAsHex()对密码进行md5加密
	 *
	 * @param user 待注册的用户
	 * @return
	 */
	@Override
	public int register(User user) {
		user.setGmtCreate(new Date());
		user.setGmtModified(new Date());
		String md5Password = DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes());
		user.setUserPassword(md5Password);
		return userMapper.insertSelective(user);
	}

	/**
	 * 用户登录
	 * 通过token（uuid生成），作为key
	 * user的json字符串作为value，保存在redis中
	 * 并且设置过期时间
	 *
	 * @param username 用户名
	 * @param password 密码
	 * @return token，如果登录失败，返回null
	 */
	@Override
	public String login(String username, String password) {
		//对密码进行加密
		String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andUserPasswordEqualTo(md5Password);
		//判断登录是否成功
		List<User> list = userMapper.selectByExample(userExample);
		if (list == null || list.size() == 0) {
			return null;
		}
		//得到user对象，并将密码设置为空
		User user = list.get(0);
		user.setUserPassword(null);
		//生成token
		String token = UUID.randomUUID().toString();

		//将前缀+token保存在redis中
		String key = USER_SESSION + ":" + token;
		jedisClient.set(key, JsonUtils.objectToJson(user));
		jedisClient.expire(key, SESSION_EXPIRE);
		return token;
	}

	/**
	 * 修改用户
	 * 用户名不能修改
	 *
	 * @param user 待修改的用户
	 */
	@Override
	public int update(User user) {
		//得到 MD5 加密后的密码
		String md5Password = DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes());
		user.setUserPassword(md5Password);
		user.setUsername(null);
		return userMapper.updateByPrimaryKeySelective(user);
	}

	/**
	 * 通过token来得到放在redis中的user信息
	 *
	 * @param token 保存在cookie中的token
	 * @return user对象
	 */
	@Override
	public User getUserByToken(String token) {
		String key = USER_SESSION + ":" + token;
		String userInfo = jedisClient.get(key);
		if (StringUtils.isBlank(userInfo)) {
			return null;
		} else {
			//重置过期时间
			jedisClient.expire(key, SESSION_EXPIRE);
			return JsonUtils.jsonToPojo(userInfo, User.class);
		}
	}

	/**
	 * 退出
	 * 通过 expire 设置为过期
	 * -1 即永不过期，-2过期
	 *
	 * @param token 保存在cookie中的token
	 * @return
	 */
	@Override
	public Long logout(String token) {
		String key = USER_SESSION + ":" + token;
		return jedisClient.expire(key, -2);
	}
}
