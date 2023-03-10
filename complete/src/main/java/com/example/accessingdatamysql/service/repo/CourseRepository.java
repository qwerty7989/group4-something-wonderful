package com.example.accessingdatamysql.service.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.service.repo.entity.CourseEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseRepository extends CrudRepository<CourseEntity, Integer> {

    @Query("SELECT * FROM COURSES")
    public Iterable<CourseEntity> queryCourse();    
}
