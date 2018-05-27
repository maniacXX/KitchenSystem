package com.kitchen.service;

import com.kitchen.pojo.User;

/**
 * @author chen
 * @date 2018/5/25 14:56
 */
public interface UserService {
	/**
	 * 检查 username 是否可用
	 *
	 * @param username 待检查的 username
	 * @return true 即可用
	 */
	boolean checkName(String username);

	/**
	 * 用户注册
	 * 通过DigestUtils.md5DigestAsHex()对密码进行md5加密
	 *
	 * @param user 待注册的用户
	 * @return
	 */
	int register(User user);

	/**
	 * 用户登录
	 * 通过token（uuid），保存在redis中
	 * 并且设置过期时间
	 *
	 * @param username 用户名
	 * @param password 密码
	 * @return token，如果登录失败，返回null
	 */
	String login(String username, String password);

	/**
	 * 修改用户
	 * 修改密码
	 *
	 * @param user 待修改的用户
	 */
	int update(User user);

	/**
	 * 通过token来得到放在redis中的user信息
	 *
	 * @param token 保存在cookie中的token
	 * @return
	 */
	User getUserByToken(String token);

	/**
	 * 退出
	 * 通过 expire 设置为过期
	 * -1 即永不过期，-2过期
	 *
	 * @param token 保存在cookie中的token
	 * @return
	 */
	Long logout(String token);
}
