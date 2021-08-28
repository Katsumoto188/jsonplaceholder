package com.demo.jsonplaceholder.model.domain;

import org.springframework.data.annotation.Id;

public class PhotoDomain {
    @Id
    public Long id;
    public String title;
    public String url;
    public String thumbnailUrl;
}
