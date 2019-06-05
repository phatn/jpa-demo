package com.musictribe.demo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

	@GetMapping
	public String productDetail(Model model) {
		System.out.println("Hello Phat");
		model.addAttribute("msg", "Hello Phat");
		return "product";
	}
}
