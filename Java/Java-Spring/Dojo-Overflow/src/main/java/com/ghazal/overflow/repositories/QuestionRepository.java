package com.ghazal.overflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ghazal.overflow.models.Question;
@Repository
public interface QuestionRepository extends CrudRepository<Question, Long>{
	 List<Question> findAll();
}
