package com.demo.jsonplaceholder.model.domain;

import org.springframework.data.annotation.Id;

public class CommentDomain {
    @Id
    public Long id;
    public String name;
    public String email;
    public String body;
}
