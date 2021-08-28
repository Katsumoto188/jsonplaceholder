package com.demo.jsonplaceholder.model.response.complete;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompleteTodoResponse {
    public String title;
    public boolean completed;
}
