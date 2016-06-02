package com.jiangbo.ssm.mapper;

import org.springframework.stereotype.Repository;

import com.jiangbo.ssm.domain.User;


public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}