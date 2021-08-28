package com.demo.jsonplaceholder.model.domain.complete;

import com.demo.jsonplaceholder.model.DTO.AddressDTO;
import com.demo.jsonplaceholder.model.DTO.CompanyDTO;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document("complete_user")

public class CompleteUserDomain {
    @Id
    public String id;
    public String name;
    public String username;
    public String email;
    public String phone;
    public String website;
    public AddressDTO address;
    public CompanyDTO company;

    public List<CompletePostDomain> posts;
    public List<CompleteAlbumDomain> albums;
    public List<CompleteTodoDomain> todos;
}
