package com.example.StudentManegment.controller;

//import ch.qos.logback.core.model.Model;
import com.example.StudentManegment.Services.StudentService;
import com.example.StudentManegment.Services.studentServiceimp;
import com.example.StudentManegment.models.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@AllArgsConstructor
public class StudetnsController {

    private final StudentService studentService;
    private final studentServiceimp studentServiceimp;
    @GetMapping("/students")
    public String liststudents(Model model){
        model.addAttribute("students",studentService.findAll());
         return "students";
    }

    @GetMapping("/student/new")
    public String addstudent(Model model){
      Student student=new Student();
      model.addAttribute("student",student);
      return "create_student" ;
    }
    @PostMapping("/students")
    public String addnewstu(@ModelAttribute("student") Student student){
     studentServiceimp.AddStudent(student);
     return "redirect:/students";
    }
    @GetMapping("/student/edit/{id}")
    public String editstudent(@PathVariable long id ,Model model){
        model.addAttribute("student",studentServiceimp.findByID(id));
      return "edit_student";
    }
    @PostMapping("/student/update/{id}")
    public String updatest(@PathVariable long id ,
       @ModelAttribute("student") Student student){
     Student exist_student=studentServiceimp.findByID(id);
     exist_student.setId(id);
     exist_student.setFirstname(student.getFirstname());
     exist_student.setLastname(student.getLastname());
     exist_student.setEmail(student.getEmail());
      studentServiceimp.UpdateStudent(exist_student);

    return "redirect:/students";
    }
    @DeleteMapping ("/student/delete/{id}")
    public String deltestu(@PathVariable long id ){
      studentServiceimp.deleteById(id);
        return "redirect:/students";
    }

}
