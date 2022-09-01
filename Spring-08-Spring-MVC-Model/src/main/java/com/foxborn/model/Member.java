package com.foxborn.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private int id;
    private String firstName;
    private String lastName;
}
