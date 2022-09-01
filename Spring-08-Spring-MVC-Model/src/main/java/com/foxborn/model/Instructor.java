package com.foxborn.model;

import com.foxborn.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instructor {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}
