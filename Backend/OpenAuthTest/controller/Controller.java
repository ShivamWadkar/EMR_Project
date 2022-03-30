package com.example.oauth2tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/") 
	public String HelloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping("/restricted")
	public String restricted()
	{
		return "To see thid text you need to login";
	}

}
