package com.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class SecurityController {

	
	@GetMapping
	
	public String getwelcome() 
	{
		return "Welcome";
	}
	
}