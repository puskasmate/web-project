package com.example.crud.model;

public class Movie {

    private int movieId;
    private String movieName;
    private String movieTheme;
    private Long movieRating;


    public Movie() {

    }

    public Movie(int movieId, String movieName, String movieTheme, Long movieRating) {
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

    public Long getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Long movieRating) {
        this.movieRating = movieRating;
    }
}
