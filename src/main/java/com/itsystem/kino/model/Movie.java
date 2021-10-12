package com.itsystem.kino.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Duration;

@Entity
public class Movie {

    @Id
    private int movieID;
    private String movieName;
    private Duration duration;
    private String description;
    private int ageRestriction;
    private String actors;

    public Movie() {
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", movieName='" + movieName + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", ageRestriction=" + ageRestriction +
                ", actors='" + actors + '\'' +
                '}';
    }
}
