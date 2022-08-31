package com.foxborn.proxy;

import com.foxborn.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // this class is injected to CommentService, so we add @Component
//@Primary   -- if only have one or two implemetations
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{    // 3. this is one implementation of interface - that send comment as email
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Email notification for comment : " + comment.getText());
    }
}
