package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.proxy.EmailCommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    //            interface name      local variable      : use polymorphism for loose coupling
    private final CommentNotificationProxy commentNotificationProxy;

    /**
     * in order to avoid any mistake regarding the autowiring developers put final to:
     * get a warning if a constructor is forgotten to be created
     * or
     * to get a warning if a new field is added, and it is not included in the constructor
     * then we fix it immediately
     */

    //we create a constructor so that spring can autowire (if there is only one constructor, no need for @Autowired annotation)
    public CommentService(CommentRepository commentRepository, @Qualifier("emailCommentNotificationProxyf") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment (Comment comment){
        // save in the DB
        commentRepository.storeComment(comment);

        // send email
        commentNotificationProxy.sendComment(comment);
    }
}

//1:41
//2:22