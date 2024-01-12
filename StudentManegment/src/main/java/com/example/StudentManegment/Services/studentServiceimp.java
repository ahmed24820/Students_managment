package com.example.StudentManegment.Services;

import com.example.StudentManegment.models.Student;
import com.example.StudentManegment.repository.studentsrepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class studentServiceimp implements StudentService{

    private final studentsrepo studentsrepo;
    @Override
    public List<Student> findAll()
    {
        return studentsrepo.findAll();
    }

    @Override
    public Student findByID(Long id)
    {
        return studentsrepo.findById(id).get();
    }

    @Override
    public void AddStudent(Student student)
    {
       studentsrepo.save(student);
    }

    @Override
    public void UpdateStudent(Student student) {
     studentsrepo.save(student);
    }

    @Override
    public void deleteById(long id) {
        studentsrepo.deleteById(id);
    }
}
