package com.nestdigital.moviebackendapp.Controller;

import com.nestdigital.moviebackendapp.Model.MovieModel;
import com.nestdigital.moviebackendapp.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movieAd",consumes = "application/json",produces = "application/json")
    private String movieAd(@RequestBody MovieModel movie){
        System.out.println(movie.toString());
        dao.save(movie);
        return "{Status:'Success'}";
    }
}
