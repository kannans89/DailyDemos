package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	public HelloController() {
		System.err.println("hello controller");
	}
	@GetMapping("/hello")
	public String Gethello() {
		System.out.println("inside hello");
		return "hello.html";
	}
}
