package com.alcoholism.photo.controllers;


import com.alcoholism.photo.models.Photo;
import com.alcoholism.photo.repo.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.UnsupportedEncodingException;
import java.util.Base64;


@Controller
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;



    @GetMapping("/photos")
    public String photoMain(Model model) throws UnsupportedEncodingException {
        model.addAttribute("title", "Портфолио");
        Iterable<Photo> photos = photoRepository.findAll();
        model.addAttribute("fotos", photos);

        return "photo-main";
    }

    @GetMapping("/photos/add")
    public String photoAdd(Model model){
        return "photo-add";
    }

}
