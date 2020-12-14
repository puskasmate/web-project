package com.example.crud.controller;

import com.example.crud.model.Movie;
import com.example.crud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/getMovieList")
    public List<Movie> fetchMovieList() {
        List<Movie> movies = new ArrayList<>();
        movies = movieService.fetchMovieList();
        return movies;
    }

    @PostMapping("/addMovieToList")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovieToDB(movie);
    }

    @GetMapping("/getMovieById/{id}")
    public Movie fetchMovieById(@PathVariable int movieId) {

        return movieService.fetchMovieById(movieId).get();

    }

}
