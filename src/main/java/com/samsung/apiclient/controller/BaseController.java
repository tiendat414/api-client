package com.samsung.apiclient.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
	@GetMapping("/userinfo")
	public String test(Model model, Principal principal) {
		model.addAttribute("name", principal.getName());
		System.out.println(principal.getName());
		return "userinfo";
	}
	
	@GetMapping("/test")
	public String test2() {
		return "test";
	}
}
