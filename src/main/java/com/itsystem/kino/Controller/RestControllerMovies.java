package com.itsystem.kino.Controller;

import com.itsystem.kino.Model.Movie;
import com.itsystem.kino.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerMovies {

    @Autowired
    MovieRepository movieRepository;

    /**
     * @return a list of movies when the /movie is called
     */
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
