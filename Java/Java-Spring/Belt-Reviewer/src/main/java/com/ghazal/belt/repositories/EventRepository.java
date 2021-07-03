package com.ghazal.belt.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ghazal.belt.models.Event;

public interface EventRepository extends CrudRepository<Event, Long>{

}
