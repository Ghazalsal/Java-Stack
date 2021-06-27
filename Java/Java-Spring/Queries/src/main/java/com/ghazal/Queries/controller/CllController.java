package com.ghazal.Queries.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CllController {
@RequestMapping("/")
public String Hello() {
	return "hello.jsp";
}
}