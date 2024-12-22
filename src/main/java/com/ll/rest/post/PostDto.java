package com.ll.rest.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {
    private long id;
    private LocalDateTime creatDate;
    private LocalDateTime modifyDate;
    private String title;
    private String content;

    public PostDto(Post post) {
        this.id = post.getId();
        this.creatDate = post.getCreatedAt();
        this.modifyDate = post.getModifiedAt();
        this.title = post.getTitle();
        this.content = post.getContent();
    }
}