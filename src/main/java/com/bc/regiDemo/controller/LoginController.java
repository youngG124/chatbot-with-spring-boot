package com.bc.regiDemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bc.regiDemo.service.UserService;
import com.bc.regiDemo.vo.UserVO;

import lombok.AllArgsConstructor;

@RequestMapping("/users")
@RestController
@AllArgsConstructor
public class LoginController {

	@GetMapping("/mylogin")
	public ModelAndView openUserWrite() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mylogin");
		
		return mav;
	}
	
	@GetMapping("/login2")
	public ModelAndView openLoginSucceed() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginSucceed");
		
		return mav;
	}
}
