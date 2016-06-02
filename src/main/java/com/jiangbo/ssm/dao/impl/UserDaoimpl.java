package com.jiangbo.ssm.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jiangbo.ssm.dao.UserDao;
import com.jiangbo.ssm.domain.User;
import com.jiangbo.ssm.mapper.UserMapper;

@Repository
public class UserDaoimpl implements UserDao{

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(Integer userId) {
		
		return userMapper.selectByPrimaryKey(userId);
	}

}
