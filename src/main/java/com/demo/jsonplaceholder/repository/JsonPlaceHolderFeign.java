package com.demo.jsonplaceholder.repository;

import com.demo.jsonplaceholder.model.placeholder.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JsonPlaceHolderFeign {

    @GetMapping("/todos")
    List<TodoPlaceHolder> getTodos();

    @GetMapping("/albums")
    List<AlbumPlaceHolder> getAlbums();

    @GetMapping("/photos")
    List<PhotoPlaceHolder> getPhotos();

    @GetMapping("/posts")
    List<PostPlaceHolder> getPost();

    @GetMapping("/comments")
    List<CommentPlaceHolder> getComment();

    @GetMapping("/users")
    List<UserPlaceHolder> getUsers();
}
