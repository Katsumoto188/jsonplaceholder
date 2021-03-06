package com.demo.jsonplaceholder.model.domain;

import lombok.Builder;
import lombok.Data;
import com.demo.jsonplaceholder.model.DTO.AddressDTO;
import com.demo.jsonplaceholder.model.DTO.CompanyDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "todo")

public class UserDomain {
    @Id
    public Long id;
    public String name;
    public String username;
    public String email;
    public String phone;
    public String website;
    public AddressDTO address;
    public CompanyDTO company;

    public List<Long> posts;
    public List<Long> albums;
    public List<Long> todos;
}
