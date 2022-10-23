package com.foxborn.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity { //extend to have a common id attribute

    private String department;
    private String division;

    @OneToOne(mappedBy = "department") // creates bidirectional relationship, doesnt create its foreign key in Department table
    private Employee employee;

    public Department(String department, String division) { //constructor without ID !
        this.department = department;
        this.division = division;
    }
}
