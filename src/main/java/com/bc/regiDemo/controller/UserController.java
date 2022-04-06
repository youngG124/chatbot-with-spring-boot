package com.bc.regiDemo.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.bc.regiDemo.service.UserService;
import com.bc.regiDemo.vo.UserVO;

import lombok.AllArgsConstructor;

@RequestMapping("/users/")
@RestController
@AllArgsConstructor
public class UserController {

	@GetMapping("/register")
	public ModelAndView openUserWrite(Model model) {
		model.addAttribute("user", new UserVO());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		
		return mav;
	}

	private UserService service;
	
	@PostMapping(value = "/new2.do")
	public RedirectView create2(final UserVO vo, RedirectAttributes attributes) {
		System.out.println("<controller layer> Registering...");
		try {
			int isRegistered = service.register(vo);
			if(isRegistered == 0) {
				System.out.println("register failed");
			}
		} catch (DataAccessException e) {
			System.out.println("error in database");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("error in system");
		}
		
		attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
		attributes.addAttribute("attribute", "redirectWithRedirectView");
		
		return new RedirectView("mylogin");
	}
}