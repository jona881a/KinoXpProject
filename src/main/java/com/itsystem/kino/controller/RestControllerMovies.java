package com.itsystem.kino.controller;

import com.itsystem.kino.model.Movie;
import com.itsystem.kino.model.Room;
import com.itsystem.kino.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowedHeaders = "Access-Control-Allow-Origin")
@RestController
public class RestControllerMovies {

    @Autowired
    MovieRepository movieRepository;

    /**
     * @return a list of movies when the /movies is called
     */

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    /*
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    /*@GetMapping("/movies")
    public List<Movie> getMoviesByMovieID() {
        return movieRepository.getMoviesByMovieID();
    }
    @GetMapping("/movies_isCanceled")
    public List<Movie> getMoviesByMovieIDAndIsAvailable() {
        return movieRepository.getMoviesByMovieIDAndIsAvailable();
    }
    */

}
