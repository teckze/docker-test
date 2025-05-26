package com.psa.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	public String getMessage() {
		return "hello";
	}

}
