package com.ll.rest.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {
    private long id;
    @JsonIgnore
    private LocalDateTime createDate;
    @JsonIgnore
    private LocalDateTime modifyDate;
    private String title;
    private String content;

    public PostDto(Post post) {
        this.id = post.getId();
        this.createDate = post.getCreatedAt();
        this.modifyDate = post.getModifiedAt();
        this.title = post.getTitle();
        this.content = post.getContent();
    }

    public LocalDateTime getCreatedDatetime() {
        return createDate;
    }
    public LocalDateTime getModifiedDatetime() {
        return modifyDate;
    }
}