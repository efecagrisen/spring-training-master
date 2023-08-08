package com.cydeo.service;

import com.cydeo.config.AppConfigData;
import com.cydeo.config.DBConfigData;
import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    //               interface name               local variable      : use polymorphism for loose coupling
    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;
    private final AppConfigData appConfigData;
    private final DBConfigData dbConfigData;
    /**
     * in order to avoid any mistake regarding the autowiring developers put final in the fields in order
     * to get a warning if a constructor is forgotten to be created
     * or
     * to get a warning if a new field is added, and it is not included in the constructor
     * then we fix it immediately
     */

    //we create a constructor so that spring can autowire (if there is only one constructor, no need for @Autowired annotation)
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, AppConfigData appConfigData, DBConfigData dbConfigData) {
                                                                        /*  '--> CUSTOMIZED BEAN NAME: (Default bean name:emailCommentNotificationProxy) :
                                                                        means whenever CommentService requires an object from
                                                                        the CommentNotificationProxy interface always provide emailCommentNotificationProxy  */
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        this.appConfigData = appConfigData;
        this.dbConfigData = dbConfigData;
    }

    public void publishComment (Comment comment){
        commentRepository.storeComment(comment); // to save in the DB
        commentNotificationProxy.sendComment(comment); // to send email
    }

    public void printConfigData(){

        System.out.println(appConfigData.getUserName());
        System.out.println(appConfigData.getPassword());
        System.out.println(appConfigData.getUrl());

    }

    public void printDbConfigData(){
        System.out.println(dbConfigData.getUsername());
        System.out.println(dbConfigData.getPassword());
        System.out.println(dbConfigData.getType());
    }




}

