package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

	@GetMapping("/getData")
	public @ResponseBody String getdataS2() {
		
		return "Service#2";
	}
}
