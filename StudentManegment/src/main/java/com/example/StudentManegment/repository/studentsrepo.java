package com.example.StudentManegment.repository;

import com.example.StudentManegment.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentsrepo extends JpaRepository<Student,Long> {

}
