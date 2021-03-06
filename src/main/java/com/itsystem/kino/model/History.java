package com.itsystem.kino.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class History {

    @Id
    private int screeningID;

    @OneToOne
    @JoinColumn(name = "screeningID")
    private Room room;

    private String movieName;
    private Date startTime;
    private Date endTime;
    private double seatPrice;
    private int AgeRestriction;
    private int reservedSeats;
    private int availableSeats;
    private double percentageReserved;
    private boolean isCancelled;

    public History() { }


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

    public int getAgeRestriction() {
        return AgeRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        AgeRestriction = ageRestriction;
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
        return "History{" +
                "screeningID=" + screeningID +
                ", room=" + room +
                ", movieName='" + movieName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", seatPrice=" + seatPrice +
                ", AgeRestriction=" + AgeRestriction +
                ", reservedSeats=" + reservedSeats +
                ", availableSeats=" + availableSeats +
                ", percentageReserved=" + percentageReserved +
                ", isCancelled=" + isCancelled +
                '}';
    }
}
