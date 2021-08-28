package com.demo.jsonplaceholder.model.response.complete;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompleteCommentResponse {
    public String name;
    public String email;
    public String body;
}
