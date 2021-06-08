package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String sayHello() {
		return Application.sayHello();
	}

	
	@GetMapping("/bye")
	public String sayBye() {
		return Application.sayBye();
	}
}