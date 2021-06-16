package com.ghazal.dojo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DojoController {
	
	@RequestMapping("")
	public String login(Model model) {
		
		return "index.jsp";
	}
	

	@RequestMapping("/result")
    public String result(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value ="language") String language,@RequestParam(value ="comm") String comm, Model model) {
		
    	 model.addAttribute("name",name);
		 model.addAttribute("location",location);
		 model.addAttribute("language",language);
		 model.addAttribute("comm",comm);
		
		
		return "result.jsp";
		
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	    public String login(RedirectAttributes ra, @RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value ="language") String language,@RequestParam(value ="comm") String comm, Model model) {
		 {
			 
			 ra.addAttribute("name" , name);
			 ra.addAttribute("location" , location);
			 ra.addAttribute("language" , language);
			 ra.addAttribute("comm" , comm);
			 
			 
	      return "redirect:/result"; 
	  }

}
}
