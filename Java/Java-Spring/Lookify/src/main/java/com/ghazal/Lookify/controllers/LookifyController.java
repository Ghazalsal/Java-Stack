package com.ghazal.Lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ghazal.Lookify.models.Lookify;
import com.ghazal.Lookify.services.LookifyService;

@Controller
public class LookifyController {
	 private final LookifyService lookifyService;
	    
	    public LookifyController(LookifyService lookifyService) {
	        this.lookifyService = lookifyService;
	    }
	    @RequestMapping("")
	    public String index() {
	        return "index.jsp";
	    }
	    
	    @RequestMapping("/dashboard")
	    public String dashboard(Model model) {
	        List<Lookify> lookifys = lookifyService.allLookifys();
	        model.addAttribute("lookifys", lookifys);
	        return "/dashboard.jsp";
	    }
	    @RequestMapping("/search/{artist}")
	    public String search(@PathVariable("artist") String artist,Model model) {
	    	List<Lookify> lookify = lookifyService.getLookify(artist);
	    	model.addAttribute("artist",artist);
	    	model.addAttribute("lookify",lookify);
			return "/search.jsp";
	    }
	    @PostMapping("/search")
		public String search(@RequestParam("artist") String artist) {
			return "redirect:/search/"+artist;
		}
	    
		@RequestMapping("/songs/{id}")
	    public String show(Model model,@PathVariable("id") Long id) {
			Lookify lookify = lookifyService.findLookify(id);
			model.addAttribute("lookify",lookify);
	        return "/show.jsp";
	    }
		
		@RequestMapping("/songs/new")
	    public String newLookify(@ModelAttribute("lookify") Lookify lookify) {
	        return "/create.jsp";
	    }
	    @RequestMapping(value="/songs/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("lookify")Lookify lookify, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/create.jsp";
	        } else {
	        	lookifyService.createLookify(lookify);
	            return "redirect:/dashboard";
	        }
	    }
	    @RequestMapping("/search/topTen")
		public String topten(Model model) {
			List<Lookify> lookify = lookifyService.getTopTen();
			model.addAttribute("lookify", lookify);
			return "/topten.jsp";
		}
	    
	    
	    
	    @RequestMapping(value="/songs/delete/{id}", method=RequestMethod.DELETE)
	    public String destroy(@PathVariable("id") Long id) {
	    	lookifyService.deleteLookify(id);
	    	return "redirect:/dashboard";
	    }
}
