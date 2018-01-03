package com.wch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wch.dao.UserMapper;
import com.wch.pojo.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User login(User user) {
		return userMapper.login(user);
	}
	
}
