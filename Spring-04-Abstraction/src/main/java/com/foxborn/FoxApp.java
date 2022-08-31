package com.foxborn;

import com.foxborn.config.ProjectConfig;
import com.foxborn.model.Comment;
import com.foxborn.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
*/
public class FoxApp {
    public static void main(String[] args) {

        // Create object
        Comment comment = new Comment();
        comment.setAuthor("Foxborn");
        comment.setText("Spring Framework");

        // Create Container
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);  // based on configuration, pass config class name
        // Run functionality
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
