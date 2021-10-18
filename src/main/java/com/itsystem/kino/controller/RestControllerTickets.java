package com.itsystem.kino.controller;

import com.itsystem.kino.model.Screening;
import com.itsystem.kino.model.Ticket;
import com.itsystem.kino.repository.ScreeningRepository;
import com.itsystem.kino.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class RestControllerTickets {

    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    ScreeningRepository screeningRepository;

    /**
     * Method saves bought ticket and changes available seats and reservedseats variables in screening
     * @param ticket
     * @return HttpStatus telling if it went wrong or right
     */
    @PostMapping(value="/saveTicket", consumes="application/json")
    public ResponseEntity<Ticket> saveTicket(@RequestBody Ticket ticket) {
        Optional<Screening> screenings = screeningRepository.findById(ticket.getScreening().getScreeningID());

        if(screenings.isPresent()) { //vi opdatere reserverede sæder og tilgængelige sæder i screeningen tilknyttet til der hvor billetten er købt til
            Screening screening = screenings.get();
            int reservedSeats = screening.getReservedSeats();
            int availableSeats = screening.getAvailableSeats();
            int roomCapacity = screening.getRoom().getSeat();

            screening.setReservedSeats(reservedSeats + 1);
            screening.setAvailableSeats(availableSeats - 1);
            screening.setPercentageReserved((double) (reservedSeats/roomCapacity) * 100); //NOT WORKING

            screeningRepository.save(screening);
        }
        ticketRepository.save(ticket);

        return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
    }
}
