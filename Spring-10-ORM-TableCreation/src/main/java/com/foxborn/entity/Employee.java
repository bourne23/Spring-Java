package com.foxborn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This employee class is an Entity and represents a db table. Each instance of this object is a row in a table
 * cant be final, coz needs to be extended
 */
@Entity     // 1. create table employee  - sql query insert ... ; requires PrimaryKey
public class Employee {

    @Id  // 2. defines primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //columns
    private String name; //columns

}
