package com.example.StudentManegment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
   @SequenceGenerator(
           name = "students_sequence",
           sequenceName = "students_sequence",
           allocationSize = 1
   )
    @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "students_sequence"
    )
   private long id ;
    @Column(name = "First_Name" ,nullable = false)
   private String firstname;
    @Column(name = "Last_Name")
   private String lastname;
    @Column(name = "E_mail")
    private String email;

    public Student( String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
}
