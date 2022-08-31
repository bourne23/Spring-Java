package com.foxborn.proxy;

import com.foxborn.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
