package com.example.springboottest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
  
    @Column(name = "name", nullable = false)
    private String name;
   
    @Column(name = "description", nullable = false)
    private String description;
 
    public Student() {
        
    }
    public Student(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
          "Student [id=%s, name=%s, description=%s]", id, name, description);
    }
}
