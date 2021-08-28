package com.demo.jsonplaceholder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.demo.jsonplaceholder.repository.PostRepository;

@Service
@RequiredArgsConstructor

public class PostService {
    final PostRepository postRepository;
}
