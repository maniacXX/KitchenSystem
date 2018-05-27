package com.kitchen.controller;

import com.kitchen.bean.ResultBean;
import com.kitchen.pojo.User;
import com.kitchen.service.UserService;
import com.kitchen.util.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户处理控制器
 *
 * @author chen
 * @date 2018/5/25 15:03
 */
@Controller
@RequestMapping("/user")
public class UserController {
	private final UserService userService;
	@Value("${COOKIE_USER_KEY}")
	private String COOKIE_USER_KEY;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 检查 username 是否可用
	 *
	 * @param username
	 * @return
	 */
	@RequestMapping("/checkName")
	@ResponseBody
	public ResultBean checkName(@RequestParam("username") String username) {
		String reg = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)";
		if (!username.matches(reg)) {
			return ResultBean.checkFail("用户名必须是2-5位中文或6-16位英文和数字的组合");
		}
		//数据库用户名重复校验
		if (userService.checkName(username)) {
			return ResultBean.success("用户名可用");
		} else {
			return ResultBean.checkFail("该用户名已经存在");
		}
	}

	/**
	 * 检查 pojo 是否满足格式，如果不满足即返回错误原因
	 *
	 * @param result
	 * @return
	 */
	private Map<String, Object> checkPojoFormat(BindingResult result) {
		if (result.hasErrors()) {
			List<FieldError> errors = result.getFieldErrors();
			Map<String, Object> map = new HashMap<>(16);
			for (FieldError error : errors) {
				map.put(error.getField(), error.getDefaultMessage());
			}
			return map;
		} else {
			return null;
		}
	}

	/**
	 * 用户注册，通过@valid注解来检验，如果有错，返回错误 map ，
	 * 并且对用户名进行查重验证，避免绕过前端进行注册
	 *
	 * @param user   待注册的用户
	 * @param result
	 * @return 返回ResultBean，如果有错，包含错误信息
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean register(@Valid User user, BindingResult result) {
		Map<String, Object> errors = checkPojoFormat(result);
		if (errors != null) {
			return ResultBean.checkFail(errors);
		} else if (!userService.checkName(user.getUsername())) {
			return ResultBean.checkFail("用户名不可用");
		} else {
			return ResultBean.success(userService.register(user));
		}
	}

	/**
	 * 用户登录
	 * 登陆成功后将 token 放入cookie中
	 *
	 * @param user           封装好的pojo
	 * @param ensurePassword 再次确认的密码
	 * @param result         @valid 所注解的pojo出错result
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean login(@Valid User user, String ensurePassword, BindingResult result,
	                        HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> errors = checkPojoFormat(result);

		//判断登录的账号和密码格式是否正确
		if (!ensurePassword.equals(user.getUserPassword())) {
			return ResultBean.checkFail("两次密码不相同");
		} else if (errors != null) {
			return ResultBean.checkFail(errors);
		}

		//判断是否登录成功，如果为 null，即登录失败
		String token = userService.login(user.getUsername(), ensurePassword);
		if (token != null) {
			CookieUtils.setCookie(request, response, COOKIE_USER_KEY, token);
			return ResultBean.success("登录成功");
		} else {
			return ResultBean.checkFail("账号或密码不正确");
		}
	}

	/**
	 * 通过token来得到放在redis中的user信息
	 *
	 * @param token 保存在cookie中的token
	 * @return
	 */
	@RequestMapping(value = "/token/{token}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean getUserByToken(@PathVariable String token) {
		User user = userService.getUserByToken(token);
		if (user == null) {
			return ResultBean.noLogin("账号登录已过期");
		} else {
			return ResultBean.success(user);
		}
	}

	/**
	 * 退出
	 *
	 * @param token 保存在cookie中的token
	 * @return
	 */
	@RequestMapping(value = "/logout/{token}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean logout(@PathVariable String token) {
		return ResultBean.success(userService.logout(token));
	}


	/**
	 * 修改用户信息
	 *
	 * @param user   待修改的信息
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/update/{userId}", method = RequestMethod.PUT)
	@ResponseBody
	public ResultBean update(@Valid User user, BindingResult result) {
		Map<String, Object> errors = checkPojoFormat(result);
		if (errors != null) {
			return ResultBean.checkFail(errors);
		} else {
			return ResultBean.success(userService.update(user));
		}
	}
}
