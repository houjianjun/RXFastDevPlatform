package com.xtwy.controller;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * 
 * @作者： 侯建军
 * 
 * @日期：2018年5月14日 下午12:43:50
 * @公司：迅腾伟业
 * @描述：SpringBoot单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		//初始化MockMvc对象，用于测试
		mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	}

	@Test
	public void testIndex() throws Exception {
		//进行get请求，要求返回数据为JSON
		mvc.perform(MockMvcRequestBuilders.get("/index")
				.accept(MediaType.APPLICATION_JSON))
		//如果返回状态为ok，则打印输出
		.andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(MockMvcResultHandlers.print())
        .andReturn();	
	}
}
