package com.demo.jsonplaceholder.model.domain;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "todo")

public class TodoDomain {
    @Id
    public ObjectId id;
    public ObjectId UserId;
    public String title;
    public boolean completed;
}
