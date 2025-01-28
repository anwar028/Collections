package com.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Controller {
	
	@GetMapping("/get")
	public Integer add() {

		int i = 10 + 12;

		return i;
	}

}
