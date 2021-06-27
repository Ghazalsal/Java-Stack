package com.ghazal.Queries.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ghazal.Queries.models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

}
