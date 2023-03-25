package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}