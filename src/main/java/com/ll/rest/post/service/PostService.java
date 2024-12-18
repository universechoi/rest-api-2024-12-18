package com.ll.rest.post.service;

import com.ll.rest.post.Post;
import com.ll.rest.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public long count() {
        return this.postRepository.count();
    }

    public Post write(String title, String content) {
        Post post = Post.builder()
                .title(title)
                .content(content)
                .build();
        return postRepository.save(post);
    }

    public List<Post> findAllByOrderByIdDesc() {
        return postRepository.findAllByOrderByIdDesc();
    }
}
