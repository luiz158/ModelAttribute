package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/siguiente")
	public String siguiente() {
		return "siguiente";
	}
	
	@ModelAttribute("nombre")
	public String nombre() {
		return "vicente martí";
	}
}
