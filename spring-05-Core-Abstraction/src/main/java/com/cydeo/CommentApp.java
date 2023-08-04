package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp { // always keep your running class under the main package
    public static void main(String[] args) {

        /**/
        /**/Comment comment = new Comment();
        /**/comment.setAuthor("Johnson");
        /**/comment.setText("Spring Framework");
        /**/
        /* this portion is not done in the application, we create an object for sample purposes
        in the application it is created either in UI part or retrieved from DB */

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);





    }
}
