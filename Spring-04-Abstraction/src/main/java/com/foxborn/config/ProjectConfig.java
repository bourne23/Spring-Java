package com.foxborn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan // if all is located in same package as current
//@ComponentScan(basePackages = "com.foxborn") // or mention parent package
@ComponentScan(basePackages = {"com.foxborn.proxy","com.foxborn.service","com.foxborn.repository"})  // or mention each package separately
public class ProjectConfig {
}
