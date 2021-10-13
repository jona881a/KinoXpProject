package com.itsystem.kino.controller;

import com.itsystem.kino.model.Movie;
import com.itsystem.kino.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerMovies {

    @Autowired
    MovieRepository movieRepository;

    /**
     * @return a list of movies when the /movie is called
     */
    @GetMapping("/movies")
    public List<Movie> getMoviesByMovieID() {
        if (movieRepository.findAll() == )
        return              //movieRepository.getMoviesByMovieID();
    }

    @GetMapping("/movies_isCanceled")
    public List<Movie> getMoviesByMovieIDAndIsAvailable() {
        return movieRepository.getMoviesByMovieIDAndIsAvailable();
    }


}
