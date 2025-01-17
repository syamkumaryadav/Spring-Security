package com.syam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to the Home Page!";
	}

	@GetMapping("/contact")
	public String contact() {
		return "This is the Contact Page!";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the Secured Welcome Page!";
	}

	@GetMapping("/content")
	public String content() {
		return "This is Secured Content!";
	}

	@GetMapping("/statement")
	public String statement() {
		return "This is a Secured Statement!";
	}

}
