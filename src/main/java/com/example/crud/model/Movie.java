package com.example.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "movieTable")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;
    @Column(nullable = false)
    private String movieName;
    private String movieTheme;
    private Double movieRating;


    public Movie() {

    }

    public Movie(int movieId, String movieName, String movieTheme, Double movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieTheme = movieTheme;
        this.movieRating = movieRating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieTheme() {
        return movieTheme;
    }

    public void setMovieTheme(String movieTheme) {
        this.movieTheme = movieTheme;
    }

    public Double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Double movieRating) {
        this.movieRating = movieRating;
    }
}
