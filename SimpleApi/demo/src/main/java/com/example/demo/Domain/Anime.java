package com.example.demo.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Lombok feature - Getters/Setters/HashSet and Equals
@AllArgsConstructor // Lombok feature - Constructors
public class Anime {
    private long id;
    private String name;
}
