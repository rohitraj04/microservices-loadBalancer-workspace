package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

	@GetMapping("/getData")
	public @ResponseBody String getdataS1() {
		
		return "Service#1";
	}
}
