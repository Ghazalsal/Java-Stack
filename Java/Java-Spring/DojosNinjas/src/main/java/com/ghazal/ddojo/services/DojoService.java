package com.ghazal.ddojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ghazal.ddojo.models.Dojo;
import com.ghazal.ddojo.models.Ninja;
import com.ghazal.ddojo.repositories.DojoRepository;
import com.ghazal.ddojo.repositories.NinjaRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	 public DojoService(DojoRepository dojoRepository,NinjaRepository ninjaRepository) {
	        this.dojoRepository = dojoRepository;
	        this.ninjaRepository = ninjaRepository;
	    }
	  public List<Dojo> allDojos() {
	        return dojoRepository.findAll();
	    }
	 
	    public Dojo createDojo(Dojo dojo) {
	        return dojoRepository.save(dojo);
	    }
	   
	    public Dojo findDojo(Long id) {
	        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }
	    public List<Ninja> allNinjas() {
	        return ninjaRepository.findAll();
	    }
	 
	    public Ninja createNinja(Ninja ninja) {
	        return ninjaRepository.save(ninja);
	    }
	   
	    public Ninja findNinja(Long id) {
	        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	    }
	 
}
