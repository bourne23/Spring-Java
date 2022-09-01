package com.foxborn;

import com.foxborn.config.ProjectConfig;
import com.foxborn.model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoxbornApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Foxborn");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
// eager instantiation injects all dependencies at loading the context
 // with @Lazy - spring will instantiate bean only when someone calls it, not at loading


//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);

        /*
  singleton is used for all beans by default
 */
//        System.out.println(cs1);
//        System.out.println(cs2);
//
//        System.out.println(cs1 == cs2);  // same object true = com.foxborn.service.CommentService@5d534f5d




    }
}
