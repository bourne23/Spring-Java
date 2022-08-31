package com.foxborn.service;

import com.foxborn.model.Comment;
import com.foxborn.proxy.CommentNotificationProxy;
import com.foxborn.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   // this class has dependencies to CommentService, so we add @Component. Spring will manage this object as a bean in a container
public class CommentService {  // 5. Service has a relationship (dependency on other objects)

//    @Autowired
//    @Qualifier  NOT RECOMM, use it in constructor instead
    private final CommentRepository  commentRepository;  // has dependency, and we won't be making changes to them, so make it private final.
    private final CommentNotificationProxy commentNotificationProxy; // second dependency, It is interfaces, not classes

    //initialize these dependencies in constructor
//@Autowired // removed coz only one constructor
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
// or without alias:   public CommentService(CommentRepository commentRepository, @Qualifier("emailCommentNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    // create method of this service
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
