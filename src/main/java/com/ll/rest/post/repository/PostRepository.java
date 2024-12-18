package com.ll.rest.post.repository;

import com.ll.rest.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
