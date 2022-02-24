package com.js.academy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/info")
	public String getInfo()
	{
		return "This is the spring demo controller from academy";
	}

}
