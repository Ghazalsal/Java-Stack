package com.ghazal.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	private String code;
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/code", method=RequestMethod.POST)
    public String login(@RequestParam(value="code") String code) {
		if(code.equals("bushido")) {
			return "code.jsp";
		}
		else {
			return "redirect:/codeas";
		}
	}
	@RequestMapping("/codeas")
    public String flashMessages(RedirectAttributes redirectAttributes) {
		if(this.code != "bushido") {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
			
		}
		return null;
    }
}
