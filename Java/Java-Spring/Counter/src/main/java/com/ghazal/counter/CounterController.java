package com.ghazal.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class CounterController {
	Integer counter=0;
	@RequestMapping("")
	public String index(){
        this.counter++;
        return "index.jsp";
 
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.setAttribute("counter", this.counter);
        Integer counter = (Integer) session.getAttribute("counter");
		return "counter.jsp";
	}
}
