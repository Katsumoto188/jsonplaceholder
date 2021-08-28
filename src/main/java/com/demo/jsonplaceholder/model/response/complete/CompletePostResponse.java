package com.demo.jsonplaceholder.model.response.complete;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CompletePostResponse {
    public String title;
    public String body;

    public List<CompleteCommentResponse> comments;
}
