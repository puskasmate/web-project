package com.example.crud.controller;

import com.example.crud.model.Movie;
import com.example.crud.repo.MovieRepo;
import com.example.crud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;
    private MovieRepo movieRepo;


    @GetMapping("/getMovieList")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Movie> fetchMovieList() {
        List<Movie> movies = new ArrayList<>();
        movies = movieService.fetchMovieList();
        return movies;
    }

    @PostMapping("/addMovieToList")
    @CrossOrigin(origins = "http://localhost:4200")
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.saveMovieToDB(movie);
    }

    @GetMapping("/getMovieById/{movieId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Movie fetchMovieById(@PathVariable int movieId) {

        return movieService.fetchMovieById(movieId).get();

    }

    @DeleteMapping("/deleteMovieById/{movieId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String deleteMovieById(@PathVariable int movieId) {
        return movieService.deleteMovieById(movieId);

    }

}
