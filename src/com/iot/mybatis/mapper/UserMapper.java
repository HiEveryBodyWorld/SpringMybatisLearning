package com.iot.mybatis.mapper;

import com.iot.mybatis.po.User;

public interface UserMapper {
	
	User findUserById(int id) throws Exception;

}
