package com.demo.jsonplaceholder.model.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GeoDTO {
    public String lat;
    public String lng;
}
