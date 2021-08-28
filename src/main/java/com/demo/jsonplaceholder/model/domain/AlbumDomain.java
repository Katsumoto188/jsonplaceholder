package com.demo.jsonplaceholder.model.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class AlbumDomain {
    @Id
    public ObjectId id;
    public String title;

    public List<PhotoDomain> photos;
}
