package com.ghazal.overflow.services;

import org.springframework.stereotype.Service;

import com.ghazal.overflow.repositories.AnswerRepository;
import com.ghazal.overflow.repositories.QuestionRepository;
import com.ghazal.overflow.repositories.TagRepository;

@Service
public class overflowService {
	 private final QuestionRepository questionRepository;
	 private final AnswerRepository answerRepository;
	 private final TagRepository tagRepository;
	 
	 public overflowService(QuestionRepository questionRepository,AnswerRepository answerRepository,TagRepository tagRepository) {
	        this.questionRepository = questionRepository;
	        this.answerRepository = answerRepository;
	        this.tagRepository = tagRepository;
	    }
}
