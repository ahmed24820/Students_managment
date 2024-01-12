package com.example.StudentManegment;

import com.example.StudentManegment.models.Student;
import com.example.StudentManegment.repository.studentsrepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManegmentApplication {
   private final studentsrepo sudentsrepo;

	public StudentManegmentApplication(studentsrepo sudentsrepo)
	{
		this.sudentsrepo = sudentsrepo;
	}

	public static void main(String[] args)

	{
		SpringApplication.run(StudentManegmentApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Student s=new Student("ahmed","ibrahim","az@g");
//        sudentsrepo.save(s);
//		Student f=new Student("ziad","ibrahim","z@g");
//		sudentsrepo.save(f);
//	}
}
