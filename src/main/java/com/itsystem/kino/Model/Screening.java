package com.itsystem.kino.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Screening {

    @Id
    private int screeningID;
    private int roomNumber;
    private String movieName;
    private Date startTime;
    private Date endTime;
    private double seatPrice;
    private int AgeRestriction;
    private int reservedSeats;
    private int availableSeats;
    private double percentageReserved;
    private boolean isCancelled;


    public Screening(){}









}
