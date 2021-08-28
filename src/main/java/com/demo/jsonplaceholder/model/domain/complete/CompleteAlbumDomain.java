package com.demo.jsonplaceholder.model.domain.complete;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CompleteAlbumDomain {

    public String title;

    public List<CompletePhotoDomain> photos;
}
