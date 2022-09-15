package com.foxborn.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String state;
}
