package com.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api")
@RestController
public class Controller {

	@GetMapping("/get")
	public String addData() {
		
		String str = "String Data added";
		
		return str;
	}
}
