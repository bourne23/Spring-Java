package com.foxborn.repository;

import com.foxborn.model.Comment;
import org.springframework.stereotype.Component;

@Component // this class is injected to CommentService, so we add @Component
public class DBCommentRepository implements CommentRepository{ // 5. db implementation class
    @Override
    public void storeComment(Comment comment) {

        System.out.println("Storing comment in DB: " + comment.getText());
    }
}
