package com.itsystem.kino.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int screeningID;

    @ManyToOne
    @JoinColumn(name = "roomID")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "movieID")
    private Movie movie;

    @OneToOne
    @JoinColumn(name = "historyID")
    private History history;

    @OneToMany
    @JoinColumn(name = "screeningID")
    @JsonBackReference
    private Set<Ticket> tickets = new HashSet<>();

    @ManyToOne
    @JoinColumn(name= "employeeID")
    private Employee employee;


    private String movieName;
    private Date startTime;
    private Date endTime;
    private double seatPrice;
    private String ageRestriction;
    private int reservedSeats;
    private int availableSeats;
    private double percentageReserved;
    private boolean isCancelled;

    public Screening(){}

    public int getScreeningID() {
        return screeningID;
    }

    public void setScreeningID(int screeningID) {
        this.screeningID = screeningID;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getPercentageReserved() {
        return percentageReserved;
    }

    public void setPercentageReserved(double percentageReserved) {
        this.percentageReserved = percentageReserved;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    @Override
    public String toString() {
        return "Screening{" +
                "screeningID=" + screeningID +
                ", room=" + room +
                ", movie=" + movie +
                ", history=" + history +
                ", movieName='" + movieName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", seatPrice=" + seatPrice +
                ", AgeRestriction=" + ageRestriction +
                ", reservedSeats=" + reservedSeats +
                ", availableSeats=" + availableSeats +
                ", percentageReserved=" + percentageReserved +
                ", isCancelled=" + isCancelled +
                '}';
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
