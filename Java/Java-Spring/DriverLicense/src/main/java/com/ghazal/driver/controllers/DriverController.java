package com.ghazal.driver.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ghazal.driver.models.Driver;
import com.ghazal.driver.models.License;
import com.ghazal.driver.services.DriverService;



@Controller
public class DriverController {
	 private final DriverService driverService;
	    public DriverController(DriverService driverService){
	        this.driverService = driverService;
	    }
	    
	    @RequestMapping("")
	    public String dashboard(Model model) {
	        List<Driver> driver = driverService.allDrivers();
	        List<License> license = driverService.allLicense();
	        model.addAttribute("driver", driver);
	        model.addAttribute("license", license);
	        return "/dashboard.jsp";
	    }
	  
	    @RequestMapping("/persons/new")
	    public String newDriver(@ModelAttribute("driver") Driver Driver) {
	    	
	        return "/createDriver.jsp";
	    }
	    @RequestMapping(value="/persons/create", method=RequestMethod.POST)
	    public String createDriver(@ModelAttribute("driver") Driver driver,Model model) {
	        	 
	        	driverService.createDriver(driver);
	            return "redirect:/";
	    }
	    
	    
		
		
		
		 @RequestMapping("/license/new")
		    public String newLicense(@ModelAttribute("license") License license, Model model) {
			 List<Driver> driver = driverService.allDrivers();
				model.addAttribute("driver", driver);
		        return "/createLicense.jsp";
		    }
		 @RequestMapping(value="/license/create", method=RequestMethod.POST)
			public String newLicense(@ModelAttribute("license")License license) {
			 driverService.createLicense(license);
				return "redirect:/";
			}
		    
		 @RequestMapping("/person/{id}")
		 public String showProfile(@PathVariable("id")Long id, Model model) {
			 Driver findDriver = driverService.findDriver(id);
			 if (findDriver == null) {
				 return "redirect:/";
			 }else {
				 model.addAttribute("driver", findDriver);
				 
				 return "/show.jsp";
			 }
			 
		 }
	     
	   
}
