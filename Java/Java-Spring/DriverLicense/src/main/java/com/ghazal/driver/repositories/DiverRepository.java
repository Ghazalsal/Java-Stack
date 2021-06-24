package com.ghazal.driver.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghazal.driver.models.Driver;


public interface DiverRepository extends CrudRepository<Driver, Long> {
	List<Driver> findAll();

	
}
