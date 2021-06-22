package com.section1.Languages1.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.section1.Languages1.languageServices.LanguageServices;
import com.section1.Languages1.models.LanguageModel;

@Controller
public class LanguagesController {
	private final LanguageServices languageService;

	public LanguagesController(LanguageServices languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/languages")
	public String create(Model model, @ModelAttribute("language") LanguageModel language) {
		List<LanguageModel> language1 = languageService.allLanguages();
		model.addAttribute("languages", language1);
		return "index.jsp";
	}

	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") LanguageModel language, BindingResult result, Model model) {
		List<LanguageModel> language1 = languageService.allLanguages();
		model.addAttribute("languages", language1);
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}

	}

	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		LanguageModel language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "show.jsp";
	}

	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		LanguageModel language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}

	@RequestMapping(value = "/languages/update/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("language") LanguageModel language, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}

	@RequestMapping(value = "/languages/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}

}