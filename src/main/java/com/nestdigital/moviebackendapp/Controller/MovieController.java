package com.nestdigital.moviebackendapp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @PostMapping("/movieAd")
    private String movieAd(){
        return  "test";
    }
}
