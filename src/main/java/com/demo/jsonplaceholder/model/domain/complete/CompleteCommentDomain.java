package com.demo.jsonplaceholder.model.domain.complete;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompleteCommentDomain {
    public String name;
    public String email;
    public String body;
}
