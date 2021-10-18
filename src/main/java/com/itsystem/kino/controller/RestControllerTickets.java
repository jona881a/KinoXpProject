package com.itsystem.kino.controller;

import com.itsystem.kino.model.Screening;
import com.itsystem.kino.model.Ticket;
import com.itsystem.kino.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class RestControllerTickets {

    @Autowired
    TicketRepository ticketRepository;

    @PostMapping(value="/saveTicket", consumes="application/json")
    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket) {
        ticketRepository.save(ticket);

        return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
    }
}
