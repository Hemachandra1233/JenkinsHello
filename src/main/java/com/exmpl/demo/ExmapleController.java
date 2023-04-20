package com.exmpl.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ExmapleController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello world";
	}
}
