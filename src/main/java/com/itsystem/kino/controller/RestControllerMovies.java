package com.itsystem.kino.controller;

import com.itsystem.kino.model.Movie;
import com.itsystem.kino.model.Room;
import com.itsystem.kino.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
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

    @PostMapping(value="/moviesCreate", consumes = "application/json")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        System.out.println("ind i Controller");
        movieRepository.save(movie);
        return new ResponseEntity<Movie>(movie, HttpStatus.CREATED);
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
