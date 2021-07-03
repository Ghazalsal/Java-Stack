package com.axsos.logandreg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.logandreg.models.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
	List<Course> findAll();

}
