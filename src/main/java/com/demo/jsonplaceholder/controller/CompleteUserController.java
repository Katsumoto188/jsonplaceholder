package com.demo.jsonplaceholder.controller;

import com.demo.jsonplaceholder.model.placeholder.TodoPlaceHolder;
import com.demo.jsonplaceholder.model.response.complete.CompleteUserResponse;
import com.demo.jsonplaceholder.service.CompleteUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("complete")
@RequiredArgsConstructor
public class CompleteUserController {
    private final CompleteUserService completeUserService;

    @GetMapping()
    public List<TodoPlaceHolder> getUsers() {
        return completeUserService.getCompleteUsers();
    }
}
