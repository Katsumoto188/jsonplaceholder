package com.demo.jsonplaceholder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.demo.jsonplaceholder.repository.TodoRepository;

@Service
@RequiredArgsConstructor

public class TodoService {
    final TodoRepository todoRepository;
}
