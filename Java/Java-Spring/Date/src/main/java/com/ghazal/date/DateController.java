package com.ghazal.date;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
    @RequestMapping("")
    public String index(Model model, HttpSession session) {
    	session.setAttribute("name", "Ghazal");
    	model.addAttribute("name: ", session.getAttribute("name"));
		return "index.jsp";
    	
    }
    @RequestMapping("/date")
    public String date(Model model, HttpSession session) {
    	
		return "Date.jsp";
    	
    }
    @RequestMapping("/time")
    public String time(Model model, HttpSession session) {
    	
		return "Time.jsp";
    	
    }
	
}
