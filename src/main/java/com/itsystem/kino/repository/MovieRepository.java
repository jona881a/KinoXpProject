package com.itsystem.kino.repository;

import com.itsystem.kino.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> getMoviesByMovieID(Integer movieID);

    List<Movie> getMoviesByMovieIDAndIsAvailable(Integer movieID,);


}
