package com.wch.dao;

import com.wch.pojo.User;

public interface UserMapper {
   /* int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);*/

	User login(User user);

	/*User findUserByEmail(String email);*/

}