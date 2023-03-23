package com.example.demo.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.Anime;
import com.example.demo.Util.DateUtil;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("anime")
@Log4j2
public class AnimeController {

    private final DateUtil dateUtil;

    // DI Via CTOR
    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping(path = "list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ"), new Anime("One Piece"));
    }
}
