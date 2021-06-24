package com.ghazal.driver.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ghazal.driver.models.Driver;
import com.ghazal.driver.models.License;
import com.ghazal.driver.repositories.DiverRepository;
import com.ghazal.driver.repositories.LicenseRepository;

@Service 
public class DriverService {
	  private final DiverRepository diverRepository;
	  private final LicenseRepository licenseRepository;
	    
	    public DriverService(DiverRepository diverRepository, LicenseRepository licenseRepository) {
	        this.diverRepository = diverRepository;
			this.licenseRepository = licenseRepository;
	    }
	    
	    // returns all the books
	    public List<Driver> allDrivers() {
	        return diverRepository.findAll();
	    }
	    public Driver createDriver(Driver driver) {
	        return diverRepository.save(driver);
	    }
	    public Driver findDriver(Long id) {
	        Optional<Driver> optionalDriver = diverRepository.findById(id);
	        if(optionalDriver.isPresent()) {
	            return optionalDriver.get();
	        } else {
	            return null;
	        }
	    }
	    public List<License> allLicense() {
	        return licenseRepository.findAll();
	    }
	    public License createLicense(License license) {
	        return licenseRepository.save(license);
	    }
	    public License findLicense(Long id) {
	        Optional<License> optionalLicense = licenseRepository.findById(id);
	        if(optionalLicense.isPresent()) {
	            return optionalLicense.get();
	        } else {
	            return null;
	        }
	    }


		
}
