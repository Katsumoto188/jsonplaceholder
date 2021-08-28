package com.demo.jsonplaceholder.model.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class CommentDomain {
    @Id
    public ObjectId id;
    public String name;
    public String email;
    public String body;
}
