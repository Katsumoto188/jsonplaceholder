package com.demo.jsonplaceholder.model.domain.complete;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompletePhotoDomain {
    public String title;
    public String url;
    public String thumbnailUrl;
}
