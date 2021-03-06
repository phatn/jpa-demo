package com.musictribe.demo.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.musictribe.demo.repositories.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "index";
	}
	
	@GetMapping("/product")
	public String product(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "index";
	} 
	
	@GetMapping("/crazy")
	public String crazy(Model model) {
		System.out.println("Hello crazy!");
		// This is comment
		int i = 1;
		model.addAttribute("message", "Very crazy!");
		return "index";
	}
}
