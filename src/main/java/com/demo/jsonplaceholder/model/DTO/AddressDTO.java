package com.demo.jsonplaceholder.model.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDTO {
    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public GeoDTO geo;
}
