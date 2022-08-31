package com.foxborn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString  // to print objects data
public class Customer {
    private String name;
    private Car car;
}
