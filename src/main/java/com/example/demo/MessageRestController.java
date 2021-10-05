package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageRestController {
	
	@GetMapping("/message")
	public String myName()
	{
		
		return "Hello I'am Deployed";
	}

}
