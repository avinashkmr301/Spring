package com.avi.tran.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PersonController {
	
	@GetMapping("/msg")
	public String message() {
		return "Hello Spring!";
	}

}
