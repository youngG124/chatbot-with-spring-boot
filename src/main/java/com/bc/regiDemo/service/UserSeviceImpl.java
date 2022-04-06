package com.bc.regiDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bc.regiDemo.mapper.UserMapper;
import com.bc.regiDemo.vo.UserVO;

@Service
public class UserSeviceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public int register(UserVO vo) {
		System.out.println("<service layer> Registering..." + vo);
		return mapper.register(vo);
		// result of the query is 1.
	}
}
