package com.demo.jsonplaceholder.model.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class PhotoDomain {
    @Id
    public ObjectId id;
    public String title;
    public String url;
    public String thumbnailUrl;
}
