package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.dto.UserDTO;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping()
	public String showHomePage() {
		return "Home";
	}

	@GetMapping("/register")
	public String showRegister(Model model) {
		// sending form backing object new Student()
		model.addAttribute("user", new UserDTO());
		return "Register";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "Login";
	}
	


}
