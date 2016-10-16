package com.iot.mybatis.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iot.mybatis.mapper.UserMapper;
import com.iot.mybatis.po.User;

public class UserMapperTest {
	
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		
		
	}
	@Test
	public void testFindUserById() throws Exception{
		
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}
	

}
