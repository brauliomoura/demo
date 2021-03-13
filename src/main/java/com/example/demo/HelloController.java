package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class HelloController {
		
	//http://localhost:8080/api/test/hello
	@GetMapping("/hello")
	public String digaHello() {
		return "Hello Spring Rest";
	}
}
