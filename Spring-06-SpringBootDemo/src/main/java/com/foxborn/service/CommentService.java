package com.foxborn.service;

import com.foxborn.model.Comment;
import com.foxborn.proxy.CommentNotificationProxy;
import com.foxborn.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CommentService {
//
//    @Value("${url}")
//    private String url;
//
//    @Value("${password}")
//    private int password;
//
//    @Value("number")
//    private int number;
//
//    @Value("${id}")
//    private String [] ids;

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Hello");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
