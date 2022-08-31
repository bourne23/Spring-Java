package com.foxborn.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan // to look within the same package
@ComponentScan(basePackages = "com.cydeo") // to look outside the package for the beans
public class ConfigCourse {
}
