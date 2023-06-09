package com.whatsapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsappDemoController {

	@GetMapping("/login")
	public String login()
	{
		return "Login successful";
	}
	
	@GetMapping("/Landingpage/{userId}")
	public String Landingpage(@PathVariable("userId") String userId)
	{
		return "Login successful for "+userId;
	}
}
