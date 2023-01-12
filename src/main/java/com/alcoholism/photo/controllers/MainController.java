package com.alcoholism.photo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Обо мне");
       return "about";
    }
    @GetMapping("/prekl")
    public String prekl(Model model) {
        model.addAttribute("title", "PREKL");
        return "prekl";
    }
}
