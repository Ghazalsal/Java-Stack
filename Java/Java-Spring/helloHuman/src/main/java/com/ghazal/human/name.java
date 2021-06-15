package com.ghazal.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/your_server")
public class name {
	@RequestMapping("")
	public String name1() {
		return "<h1> Hello Human!</h1> <p>Welcome to Spring Boot!</p>";
	}

	@RequestMapping("/")
	public String index(@RequestParam(value = "q", required = false) String name) {
		return "<h1>Hello " + name + "</h1> <p>Welcome to Spring Boot!</p>" ;
	}
}
