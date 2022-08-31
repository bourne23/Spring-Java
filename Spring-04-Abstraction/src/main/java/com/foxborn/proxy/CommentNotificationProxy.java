package com.foxborn.proxy;

import com.foxborn.model.Comment;

// Interface dont get @Component
public interface CommentNotificationProxy {  // 2 . this interface will send comment and will be implemented by email or push notif
    void sendComment(Comment comment);  // parameter is comment object - what we are sending
}
