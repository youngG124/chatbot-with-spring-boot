package com.bc.regiDemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bc.regiDemo.vo.UserVO;

@Mapper
public interface UserMapper {
	public int register(UserVO vo);
}
