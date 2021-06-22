package com.ghazal.Lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ghazal.Lookify.models.Lookify;
import com.ghazal.Lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private final LookifyRepository lookifyRepository;
	
	 public LookifyService(LookifyRepository lookifyRepository) {
	        this.lookifyRepository = lookifyRepository;
	 }
	    public List<Lookify> allLookifys() {
	        return lookifyRepository.findAll();
	    }
	    public List<Lookify> getTopTen(){
			return lookifyRepository.findTop10ByOrderByRatingDesc();
		}
	    // creates a book
	    public Lookify createLookify(Lookify lookify) {
	        return lookifyRepository.save(lookify);
	    }
	    
	    // retrieves a book
	    public Lookify findLookify(Long id) {
	        Optional<Lookify> optionalLookify= lookifyRepository.findById(id);
	        if(optionalLookify.isPresent()) {
	            return optionalLookify.get();
	        } else {
	            return null;
	        }
	    }
		public void deleteLookify(Long id) {
			lookifyRepository.deleteById(id);
			
		}
		public List<Lookify> getLookify(String artist) {
			// TODO Auto-generated method stub
			return lookifyRepository.findByArtist(artist);
		}
		
}
