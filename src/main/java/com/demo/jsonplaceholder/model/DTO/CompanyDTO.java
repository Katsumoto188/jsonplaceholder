package com.demo.jsonplaceholder.model.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDTO {
    public String name;
    public String catchPhrase;
    public String bs;
}
