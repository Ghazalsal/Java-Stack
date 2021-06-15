package com.ghazal.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DojoController {
	@RequestMapping("/coding/{name}")
    public String showLesson(@PathVariable("name") String name){
		if(name.equals("dojo")) {
			return "The dojo is awesome!";
		}
		if(name.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		if(name.equals("san-jose")) {
			return "SJ dojo is the headquarter";
			
		}
    	return "name:" + name;
	}
}
