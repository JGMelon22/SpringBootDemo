package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Domain.Anime;

@Service
public class AnimeService {
    // private final AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return List.of(new Anime(1, "DBZ"), new Anime(2, "Naruto"));
    }
}
