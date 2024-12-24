package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/boardgames")
public class BGController {

    @GetMapping
    public List<String> getBoardGames() {
        return Stream.of("Unmatched", "Unconscious Mind", "The Witcher")
                .collect(Collectors.toList());
    }
}
