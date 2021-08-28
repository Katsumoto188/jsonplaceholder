package com.demo.jsonplaceholder.model.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "todo")

public class TodoDomain {
    @Id
    public Long id;
    public Long UserId;
    public String title;
    public boolean completed;
}
