package com.section1.Languages1.languageServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.section1.Languages1.models.LanguageModel;
import com.section1.Languages1.repositories.LanguageRepository;

@Service
public class LanguageServices {
	private final LanguageRepository languageRepository;

	public LanguageServices(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	// returns all the books
	public List<LanguageModel> allLanguages() {
		return languageRepository.findAll();
	}

	// creates a book
	public LanguageModel createLanguage(LanguageModel language) {
		return languageRepository.save(language);
	}

	// retrieves a book
	public LanguageModel findLanguage(Long id) {
		Optional<LanguageModel> optionalLang = languageRepository.findById(id);
		if (optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}
	}

	public LanguageModel updateLanguage(Long id, String name, String creator, String version) {
		LanguageModel language = languageRepository.findById(id).orElse(null);
		return languageRepository.save(language);
	}

	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
		
	}
}
