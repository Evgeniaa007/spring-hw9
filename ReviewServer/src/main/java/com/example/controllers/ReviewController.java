package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @GetMapping("/{gameId}")
    public List<String> getComments(@PathVariable String gameId) {
        switch (gameId) {
            case "1":
                return List.of("Best duel game ever!", "We've bought all heroes to have more variety.",
                        "Not really my game, I prefer 7Wonders");
            case "2":
                return List.of("Can't express how beautiful the game is!", "Want to play it more and more!");
            case "3":
                return List.of("I've been waiting for 3 years and the game didn't disappoint me",
                        "It's good only for PC game fans.");
            default:
                return List.of("No comments for this game.");
        }
    }
}
