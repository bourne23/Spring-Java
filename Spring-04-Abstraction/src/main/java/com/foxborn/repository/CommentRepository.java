package com.foxborn.repository;

import com.foxborn.model.Comment;

public interface CommentRepository { // 4. database related interface - can be implemented by multip DB - by postgres, or oracle
    void storeComment(Comment comment);  // db stores comment, pass as param
}
