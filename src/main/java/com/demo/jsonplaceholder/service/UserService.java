package com.demo.jsonplaceholder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.demo.jsonplaceholder.repository.UserRepository;

@Service
@RequiredArgsConstructor

public class UserService {
    final UserRepository userRepository;
}
