package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
	- @SpringBootConfiguration : Designates this class a configuration class. You can add Java based Spring framework configuration to this class if you need to. This annotation is a specialized form of the @Configuration annotation.

	- @EnableAutoConfiguration :  Enables Spring Boot automatic configuration. It tells Spring Boot to automatically configure any components that it thinks you will need.

	- @ComponentScan : Enables component scanning.
 */
@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {

		Comment comment = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework");

		/*(no need to add this)*/ ApplicationContext context =  SpringApplication.run(CydeoApplication.class, args);


		CommentService commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);

		commentService.printConfigData();

		commentService.printDbConfigData();

	}

}
