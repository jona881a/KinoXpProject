package com.itsystem.kino.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomID;
    private String seatRow;
    private int seat;

    @OneToMany
    @JoinColumn(name = "roomID")
    @JsonBackReference


    private Set<Screening> screenings = new HashSet<>();

    public Room() {
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(String row) {
        this.seatRow = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Set<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(Set<Screening> screenings) {
        this.screenings = screenings;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", row='" + seatRow + '\'' +
                ", seat=" + seat +
                ", screenings=" + screenings +
                '}';
    }
}
