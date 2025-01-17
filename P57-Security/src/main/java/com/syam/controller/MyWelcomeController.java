package com.syam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWelcomeController {
	
	@GetMapping("/")
	public String welcomeMsg() {
		String msg="welcome raa bhamaridhi.............";
		return msg;
	}

}
