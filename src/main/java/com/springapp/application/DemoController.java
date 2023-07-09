package com.springapp.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/errors")
	public String error() {
		return "404 page not found";
	}
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	

}
