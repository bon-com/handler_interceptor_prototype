package com.example.prototype.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping(value = "/")
	public String top() {
		return "top";
	}
}
