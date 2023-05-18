package com.sangamone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	@GetMapping("/display")
	public String display() {
		return "Thank you Ritesh";
	}

}
