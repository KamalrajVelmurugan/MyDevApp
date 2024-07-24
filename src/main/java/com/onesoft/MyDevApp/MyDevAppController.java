package com.onesoft.MyDevApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDevAppController {
	
	@GetMapping("getMsg")
	public String getMsg() {
		return "Hi I am Kamalraj Velmurugan, I am From Cuddalore.";
	}
}
