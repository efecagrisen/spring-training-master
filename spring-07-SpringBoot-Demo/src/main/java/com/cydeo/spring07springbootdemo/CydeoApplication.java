package com.cydeo.spring07springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	- @SpringBootConfiguration : Designates this class a configuration class. You can add Java based Spring framework configuration to this class if you need to. This annotation is a specialized form of the @Configuration annotation.

	- @EnableAutoConfiguration :  Enables Spring Boot automatic configuration. It tells Spring Boot to automatically configure any components that it thinks you will need.

	- @ComponentScan : Enables component scanning.
 */
@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CydeoApplication.class, args);
	}

}

// 2:00