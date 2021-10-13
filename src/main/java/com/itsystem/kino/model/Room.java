package com.itsystem.kino.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Room {
    @Id
    private int roomID;
    private String row;
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

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
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
                ", row='" + row + '\'' +
                ", seat=" + seat +
                ", screenings=" + screenings +
                '}';
    }
}
