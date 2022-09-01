package com.foxborn;

import com.foxborn.model.Comment;
import com.foxborn.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Foxborn");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);

        CommentService cs1 = context.getBean(CommentService.class);
        cs1.publishComment(comment);

    }

}
