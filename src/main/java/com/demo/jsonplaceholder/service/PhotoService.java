package com.demo.jsonplaceholder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.demo.jsonplaceholder.repository.PhotoRepository;

@Service
@RequiredArgsConstructor

public class PhotoService {
    final PhotoRepository photoRepository;
}
