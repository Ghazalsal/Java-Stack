package com.ghazal.driver.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghazal.driver.models.License;

public interface LicenseRepository extends CrudRepository<License, Long> {
	List<License> findAll();
}
