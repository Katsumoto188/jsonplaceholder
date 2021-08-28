package com.demo.jsonplaceholder.model.domain.complete;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class CompleteTodoDomain {
    public String title;
    public boolean completed;
}
