package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    void insert(Student student);

    void update(Student student);

    void deleteById(Integer id);

    Student getById(Integer id);

    List<Student> getAll();
}
