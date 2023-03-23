package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Domain.Anime;

public interface AnimeRepository {
    public List<Anime> listAll();
    public Anime getAnime(int id);
}
