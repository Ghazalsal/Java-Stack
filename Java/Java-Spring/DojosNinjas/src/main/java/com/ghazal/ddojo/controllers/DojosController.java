package com.ghazal.ddojo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ghazal.ddojo.models.Dojo;
import com.ghazal.ddojo.models.Ninja;
import com.ghazal.ddojo.services.DojoService;

@Controller
public class DojosController {
	private final DojoService dojoService;
	
	public DojosController(DojoService dojoService) {
		this.dojoService =dojoService;
	}
	@RequestMapping("")
    public String index(Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        List<Ninja> ninjas = dojoService.allNinjas();
        model.addAttribute("dojos", dojos);
        model.addAttribute("ninjas", ninjas);
        return "/index.jsp";
    }
	
//  create dojo-----------------------------
	@RequestMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "/dojo.jsp";
    }
    @RequestMapping(value="/dojos", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/dojo.jsp";
        } else {
        	dojoService.createDojo(dojo);
            return "redirect:/";
        }
    }
//  create dojo -----------------------------
    
//    create ninja-------------------------------
    @RequestMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja,Model model) {
    	List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
        return "/ninja.jsp";
    }
    @RequestMapping(value="/ninjas", method=RequestMethod.POST)
    public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
       
        	dojoService.createNinja(ninja);
            return "redirect:/";
      
    }
//    create ninja--------------------------------
//    show dojo-----------------------------------------------------
    @RequestMapping("/dojos/{id}")
	 public String showDojo(@PathVariable("id")Long id, Model model) {
    	Dojo dojo = dojoService.findDojo(id);
		model.addAttribute("dojo",dojo);
		model.addAttribute("ninjas", dojo.getNinjas());
		return "show.jsp";
	 }
//  show dojo-----------------------------------------------------
}
