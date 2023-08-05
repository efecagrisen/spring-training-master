package com.cydeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ("com.cydeo") // ---> general usage
//@ComponentScan (basePackages = {"com.cydeo.proxy","com.cydeo.service","com.cydeo.repository"})    ---> possible
public class CommentConfig {

}
