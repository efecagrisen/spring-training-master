package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        /**/
        /**/
        Comment comment = new Comment();
        /**/comment.setAuthor("Johnson");
        /**/comment.setText("Spring Framework");
        /**/
        /* this portion is not done in the application, we create an object for sample purposes
        in the application it is created either in UI part or retrieved from DB */

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1 == cs2);

        //Singleton --> always creates the same object
        //Prototype --> creates a new object each time

    }
}
