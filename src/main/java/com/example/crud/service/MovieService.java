package com.example.crud.service;

import com.example.crud.model.Movie;
import com.example.crud.repo.MovieRepo;
import org.hibernate.PropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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

        try {
            Movie movie1 = movieRepo.save(movie);
            System.out.println("Movie added successfully.");
            return movie1;
        } catch (DataIntegrityViolationException e) {
            System.out.println("You have to set the title of the movie.");
            return null;
        }



    }

    public Optional<Movie> fetchMovieById(int movieId) {

        return movieRepo.findById(movieId);

    }

    public String deleteMovieById(int movieId) {
        String result;
        try {
            movieRepo.deleteById(movieId);
            result = "Movie successfully deleted!";
            System.out.println(result);

        } catch (Exception e) {
            result = "Movie with the given id is not in the list.";
            System.out.println(result);
        }
        return result;
    }

}
