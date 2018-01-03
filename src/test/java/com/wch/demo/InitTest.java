package com.wch.demo;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wch.pojo.User;
import com.wch.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class InitTest {
	
	private static Logger logger = Logger.getLogger(InitTest.class);
	
	@Resource
	private UserService userService;
	
	@Test
	public void test01() {
		User userData = new User();
		userData.setName("admin");
		userData.setPassword("123456");
		User user = userService.login(userData);
		logger.info("值："+user.getName());
		logger.info(JSON.toJSON(user));
	}
	
	
}
