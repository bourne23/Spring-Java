package com.foxborn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.foxborn")
@ComponentScan(basePackages = {"com.foxborn.proxy","com.foxborn.service","com.foxborn.repository"})
public class ProjectConfig {
}
