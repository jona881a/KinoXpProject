package com.itsystem.kino.Repository;

import com.itsystem.kino.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movie, Integer> {
}
