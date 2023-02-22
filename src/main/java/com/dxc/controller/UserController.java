package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.dto.UserDTO;
import com.dxc.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService service;
	
	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute UserDTO dto,
			Model model
			) {
		//calling the service layer method
		Integer accNum = service.saveUser(dto);
		String message = new StringBuffer().append("User with account number ")
				.append(accNum)
				.append(" is registered successfully")
				.toString();
		
		model.addAttribute("message", message);
		model.addAttribute("user", new UserDTO());
		return "Register";
		
		
	}

}
