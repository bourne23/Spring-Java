package com.foxborn.proxy;

import com.foxborn.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  // will be injected, need to create bean/object from it
@Qualifier("PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment : " + comment.getText());
    }
}
