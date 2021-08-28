package com.demo.jsonplaceholder.model.response.complete;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompletePhotoResponse {
    public String title;
    public String url;
    public String thumbnailUrl;
}
