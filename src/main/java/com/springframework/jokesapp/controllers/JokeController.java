package com.springframework.jokesapp.controllers;

import com.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String joke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
