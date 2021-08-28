package com.demo.jsonplaceholder.model.response.complete;

import com.demo.jsonplaceholder.model.DTO.AddressDTO;
import com.demo.jsonplaceholder.model.DTO.CompanyDTO;
import com.demo.jsonplaceholder.model.domain.complete.CompleteAlbumDomain;
import com.demo.jsonplaceholder.model.domain.complete.CompletePostDomain;
import com.demo.jsonplaceholder.model.domain.complete.CompleteTodoDomain;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CompleteUserResponse {
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
