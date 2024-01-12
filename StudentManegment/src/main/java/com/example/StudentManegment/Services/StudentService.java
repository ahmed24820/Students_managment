package com.example.StudentManegment.Services;

import com.example.StudentManegment.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findByID(Long id);

    void AddStudent(Student student);

   void UpdateStudent(Student student);

    void deleteById(long id);
}
