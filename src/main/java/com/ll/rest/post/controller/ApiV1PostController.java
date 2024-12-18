package com.ll.rest.post.controller;

import com.ll.rest.post.Post;
import com.ll.rest.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class ApiV1PostController {

    private final PostService postService;

    @GetMapping
    public List<Post> getItems() {
        return postService.findAllByOrderByIdDesc();
    }

    @GetMapping("/{id}")
    public Post getItem(@PathVariable("id") long id) {
        return postService.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable("id") long id) {
        Post post = postService.findById(id).get();

        postService.delete(post);

        return "삭제가 완료되었습니다.";
    }
}
