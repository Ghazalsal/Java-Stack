//package com.ghazal.Lookify.controllers;
//
//import java.util.List;
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ghazal.Lookify.models.Lookify;
//import com.ghazal.Lookify.services.LookifyService;
//
//@RestController
//public class LookifysApi {
//	private final LookifyService lookifyService;
//
//	public LookifysApi(LookifyService lookifyService) {
//		this.lookifyService = lookifyService;
//	}
//	@RequestMapping("")
//    public String welcome() {
//        return "Welcome";
//    }
//	@RequestMapping("/dashboard")
//    public List<Lookify> index() {
//        return lookifyService.allLookifys();
//    }
//	@RequestMapping(value="/songs/new", method=RequestMethod.POST)
//    public Lookify create(@RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="rating") Integer rating) {
//		Lookify lookify = new Lookify(title, artist, rating);
//        return lookifyService.createLookify(lookify);
//    }
//	@RequestMapping("/songs/{id}")
//    public Lookify show(@PathVariable("id") Long id) {
//		Lookify lookify = lookifyService.findLookify(id);
//        return lookify;
//    }
//}
