package com.ghazal.ddojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ghazal.ddojo.models.Dojo;
@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>  {
	List<Dojo> findAll();
}
