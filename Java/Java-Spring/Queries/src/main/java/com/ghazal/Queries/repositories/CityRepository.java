package com.ghazal.Queries.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ghazal.Queries.models.City;
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
