package com.foxborn.entity;

//import com.foxborn.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity // spring creates 'Student' table out of this class
@Table(name = "students")     // to rename table in db
public class Student {                  // spring creates 'student' table

    @Id   // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // to generate randomly, coz we dont provide it, its uniq
    private Long id;

    @Column(name = "studentFirstName")  // to rename column/field with capital F
    private String firstName;            // spring creates 'first_name' column
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient   // dont how in db table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthdate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

//    @Enumerated(EnumType.STRING)
//    private Gender gender;




}
