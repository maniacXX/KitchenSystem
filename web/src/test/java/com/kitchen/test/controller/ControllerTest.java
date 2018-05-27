package com.kitchen.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.kitchen.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 通过 spring 测试模块提供的测试请求功能，测试 crud 请求的正确性
 * 出现java.lang.NoClassDefFoundError: javax/servlet/SessionCookieConfig
 * spring4 测试的时候，需要 servlet3.0 支持
 *
 * @author chen
 * @date 2018/5/17 12:45
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml", "file:src/main/webapp/WEB-INF/applicationContext-mvc.xml"})
public class ControllerTest {
	//模拟 mvc 请求，获取处理结果
	private MockMvc mockMvc;

	//传入 spring mvc的 ioc 容器
	@Autowired
	private WebApplicationContext context;

	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testUserController() throws Exception {
		//模拟请求拿到返回值

		/*MvcResult result = mockMvc.perform(MockMvcRequestBuilders.
				get("/user/checkName").param("username", "123456")).andReturn();*/

		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.
				get("/user/token/123")).andReturn();

		//请求成功后
		String contentAsString = result.getResponse().getContentAsString();
		System.out.println(contentAsString);
	}
}
