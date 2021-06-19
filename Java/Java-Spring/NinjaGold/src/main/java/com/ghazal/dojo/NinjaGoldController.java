package com.ghazal.dojo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class NinjaGoldController {
	@RequestMapping("/gold")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	@RequestMapping(value = "/process_money", method = RequestMethod.POST)
	public String login(HttpSession session, @RequestParam(value = "forms") String forms) {
		if(session.getAttribute("gold") == null) {
			
			session.setAttribute("gold",0);
			}
		int x = (int) session.getAttribute("gold");
		if(forms.equals("farm")) {
			x+= (int)Math.floor((Math.random()*11)+10);
		} else if(forms.equals("cave")) {
			x+= (int)Math.floor((Math.random()*6)+5);
		} else if(forms.equals("house")) {
			x+= (int)Math.floor((Math.random()*4)+2);
		} else if(forms.equals("casino")) {
			x+= (int)Math.floor((Math.random()*101)-50);
		}
		session.setAttribute("gold", x);
			return "redirect:/gold";

	}
}
