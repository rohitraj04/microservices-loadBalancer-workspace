package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceThreeController {

	@GetMapping("/getData")
	public @ResponseBody String getdataS3() {
		
		return "Service#3";
	}
}
