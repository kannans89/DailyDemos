package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NumberApiController {

	@Autowired
	private NumberApiClient numberApi;
	
	
	public NumberApiController() {
		
		System.err.println("controller created");
	}
	
	@GetMapping("/data")
	public String getData() {
	NumberResponse response=numberApi.GetNumber();
	 System.err.println(response.getText().toUpperCase());
		return "data";
	}
}
