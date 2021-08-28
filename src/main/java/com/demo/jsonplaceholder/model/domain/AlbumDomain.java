package com.demo.jsonplaceholder.model.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class AlbumDomain {
    @Id
    public Long id;
    public String title;

    public List<Long> photos;
}
