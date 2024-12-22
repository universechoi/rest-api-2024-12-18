package com.ll.rest.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {
    private long id;
    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;
    private String title;
    private String content;

    public PostDto(Post post) {
        this.id = post.getId();
        this.createdDateTime = post.getCreatedAt();
        this.modifiedDateTime = post.getModifiedAt();
        this.title = post.getTitle();
        this.content = post.getContent();
    }
}