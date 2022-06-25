package com.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	private String message = "Hello from spring web";

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message", message);
		return "welcome, selamat datang";
	}
}

