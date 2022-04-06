package com.bc.regiDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bc.regiDemo.mapper.UserMapper;
import com.bc.regiDemo.service.UserService;
import com.bc.regiDemo.vo.UserVO;

@SpringBootTest
public class UserMapperTest {

	// mapper layer test
	@Autowired
	private UserMapper userMapper;	
	
	//@Test
	public void createUserTest() {
		UserVO vo = new UserVO();
		vo.setUserAuth("auth1");
		vo.setUserId("newyoung124");
		vo.setUserPw("1234");
		vo.setUserName("±è½Å¿ë");
		userMapper.register(vo);
	}
	
	
	// service layer test
	@Autowired
	private UserService userService;
	
	@Test
	public void createUserTest2() {
		UserVO vo = new UserVO();
		vo.setUserAuth("auth1");
		vo.setUserId("newyoung124");
		vo.setUserPw("1111");
		vo.setUserName("±è½Å¾ç¾ç");
		userService.register(vo);
	}
}
