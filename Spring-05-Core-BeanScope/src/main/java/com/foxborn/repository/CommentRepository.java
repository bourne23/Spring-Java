package com.foxborn.repository;

import com.foxborn.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
