package com.foxborn.entity;

import com.foxborn.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    private int salary;
    @Enumerated(EnumType.STRING)
    private Gender gender;

   // create its foreign key in Department table, Not in Employee table! empl table will not have this column
    // cascading - persists data in a child object
    @OneToOne(cascade = CascadeType.ALL)  // creates a relationship with another table. foreign key/joins
//    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "department_id")  //rename the foreign column
    private Department department;

    //Database relationships are one sided; one table will have a foreign key reference to the target table.
    // In JPA, you might map this relationship as a OneToOne and specify the foreign key to use with the @JoinColumn annotation:
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id")
    private Region region;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.salary = salary;
        this.gender = gender;
    }
}
