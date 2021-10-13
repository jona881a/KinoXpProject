package com.itsystem.kino.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Time;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

    @Id
    private int movieID;
    private String movieName;
    private Time duration;
    private String description;
    private String ageRestriction;
    private String actors;
    private boolean isAvailable;

    @OneToMany
    @JoinColumn(name = "movieID")
    @JsonBackReference

    private Set<Screening> screenings = new HashSet<>();

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

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Set<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(Set<Screening> screenings) {
        this.screenings = screenings;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", movieName='" + movieName + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", ageRestriction='" + ageRestriction + '\'' +
                ", actors='" + actors + '\'' +
                ", isAvailable=" + isAvailable +
                ", screenings=" + screenings +
                '}';
    }
}
