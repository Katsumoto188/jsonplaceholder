package com.demo.jsonplaceholder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.demo.jsonplaceholder.repository.CommentRepository;

@Service
@RequiredArgsConstructor

public class CommentService {
    final CommentRepository commentRepository;
}
