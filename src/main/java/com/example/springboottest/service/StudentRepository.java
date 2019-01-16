package com.example.springboottest.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboottest.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
