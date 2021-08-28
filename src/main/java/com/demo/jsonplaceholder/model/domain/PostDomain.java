package com.demo.jsonplaceholder.model.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class PostDomain {
    @Id
    public Long id;
    public String title;
    public String body;

    public List<Long> comments;
}
