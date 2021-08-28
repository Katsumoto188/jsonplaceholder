package com.demo.jsonplaceholder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.demo.jsonplaceholder.repository.AlbumRepository;

@Service
@RequiredArgsConstructor

public class AlbumService {
    final AlbumRepository albumRepository;
}
