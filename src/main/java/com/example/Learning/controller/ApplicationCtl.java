package com.example.Learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationCtl {
	
	@GetMapping("/hello")
	public String printHello() {
		return "Hello World" ;
	}

}
