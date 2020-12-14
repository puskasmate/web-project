package com.example.crud.service;

import com.example.crud.model.Movie;
import com.example.crud.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> fetchMovieList() {
        return movieRepo.findAll();
    }

    public Movie saveMovieToDB(Movie movie) {

        return movieRepo.save(movie);

    }

    public Optional<Movie> fetchMovieById(int movieId) {

        return movieRepo.findById(movieId);

    }

    public String deleteMovieById(int movieId) {
        String result;
        try {
            movieRepo.deleteById(movieId);
            result = "Movie successfully deleted!";

        } catch (Exception e) {
            result = "Movie with the given id is not in the list.";
        }
        return result;
    }

}
