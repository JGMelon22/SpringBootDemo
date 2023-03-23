package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.Domain.Anime;

@Service
public class AnimeService {
    // Going Mckeiver pseudo in memory db
    private static List<Anime> animes;
    static {
        animes = new ArrayList<>(List.of(new Anime(1, "DBZ"), new Anime(2, "Naruto")));
    }

    // private final AnimeRepository animeRepository;

    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream().filter(x -> x.getId() == (id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Anime not found!"));
    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 999));
        animes.add(anime);

        return anime;
    }

    public void delete(long id) {
        animes.remove(findById(id));
    }

    public void edit(Anime anime) {
        delete(anime.getId());
        animes.add(anime);
    }
}