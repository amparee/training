package com.example.demo.controller;


import com.example.demo.entity.Game;
import com.example.demo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/showgames")
    public List<Game> showGames(){
        return gameRepository.findAll();
    }

}
