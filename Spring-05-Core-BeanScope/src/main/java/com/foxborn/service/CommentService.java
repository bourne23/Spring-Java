package com.foxborn.service;

import com.foxborn.model.Comment;
import com.foxborn.proxy.CommentNotificationProxy;
import com.foxborn.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component    // A - spring instantiates bean whenever it loads context - eager instantiation - is default
//@Scope("prototype")     // 1. creates different bean in the container, c1==c2 will return false
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)  // 2. another way to create diffr bean
@Lazy  // spring will instantiate bean only when someone calls it, not at loading -- lazy instantiation
public class CommentService {

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
