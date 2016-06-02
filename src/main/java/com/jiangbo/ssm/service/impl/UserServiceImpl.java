package com.jiangbo.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiangbo.ssm.dao.UserDao;
import com.jiangbo.ssm.domain.User;
import com.jiangbo.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User getUserById(Integer userId) {
		return userDao.getUserById(userId);
	}

}
