package com.demo.jsonplaceholder.model.domain.complete;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CompletePostDomain {
    public String title;
    public String body;

    public List<CompleteCommentDomain> comments;
}
