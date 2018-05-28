package com.kitchen.interceptor;

import com.kitchen.service.UserService;
import com.kitchen.util.CookieUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * user拦截
 *
 * @author chen
 * @date 2018/5/27 16:20
 */

public class UserInterceptor implements HandlerInterceptor {
	@Value("${COOKIE_USER_KEY}")
	private String COOKIE_USER_KEY;
	@Value("${USER_LOGIN_PAGE}")
	private String USER_LOGIN_PAGE;

	@Autowired
	private UserService userService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//从cookie中取得token
		String token = CookieUtils.getCookieValue(request, COOKIE_USER_KEY);

		//token为null 或 在redis中token已过期
		if (StringUtils.isBlank(token) || userService.getUserByToken(token) == null) {
			response.sendRedirect(USER_LOGIN_PAGE);
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}
}
