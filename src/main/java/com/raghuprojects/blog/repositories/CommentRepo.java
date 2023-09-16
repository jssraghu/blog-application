package com.raghuprojects.blog.repositories;

import com.raghuprojects.blog.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo  extends JpaRepository<Comment, Integer> {

}
