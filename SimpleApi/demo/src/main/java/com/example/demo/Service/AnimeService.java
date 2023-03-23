package com.example.demo.Service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.Domain.Anime;

@Service
public class AnimeService {
    private List<Anime> animes = List.of(new Anime(1, "DBZ"), new Anime(2, "Naruto"));

    // private final AnimeRepository animeRepository;

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream().filter(anime -> anime.getId() == (id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }
}