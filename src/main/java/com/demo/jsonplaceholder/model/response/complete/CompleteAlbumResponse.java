package com.demo.jsonplaceholder.model.response.complete;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder

public class CompleteAlbumResponse {

    public String title;
    public List<CompletePhotoResponse> photos;
}
