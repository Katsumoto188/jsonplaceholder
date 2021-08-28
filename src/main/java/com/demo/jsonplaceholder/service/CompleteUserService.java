package com.demo.jsonplaceholder.service;

import com.demo.jsonplaceholder.model.placeholder.TodoPlaceHolder;
import com.demo.jsonplaceholder.model.response.complete.CompleteUserResponse;
import com.demo.jsonplaceholder.repository.CompleteUserRepository;
import com.demo.jsonplaceholder.repository.JsonPlaceHolderFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompleteUserService {
    private final CompleteUserRepository completeUserRepository;
    private final JsonPlaceHolderFeign jsonPlaceHolderFeign;

    public List<TodoPlaceHolder> getCompleteUsers()
    {
        return jsonPlaceHolderFeign.getTodos();
//        return null;
    }
}
