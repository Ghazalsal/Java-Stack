package com.ghazal.belt.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ghazal.belt.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long>{

}
