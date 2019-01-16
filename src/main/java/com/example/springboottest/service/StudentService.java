package com.example.springboottest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springboottest.model.Student;

@Component
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> createStudent() {
        List<Student> students = new ArrayList<Student>();
        List<Student> savedStudents = new ArrayList<Student>();
        
        students.add(new Student("Rajesh Bhojwani", "Class 10"));
        students.add(new Student("Sumit Sharma", "Class 9"));
        students.add(new Student("Rohit Chauhan", "Class 10"));
        Iterable<Student> itrStudents=repository.saveAll(students);
        itrStudents.forEach(savedStudents::add);

        return savedStudents;
    }

    public Student retrieveStudent(Integer studentId) {
       return repository.findById(studentId).orElse(new Student());
  
    }
 
}
