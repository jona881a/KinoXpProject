package com.itsystem.kino.controller;


import com.itsystem.kino.model.Screening;
import com.itsystem.kino.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.stereotype.Controller
public class ControllerScreenings {

    @Autowired
    ScreeningRepository screeningRepository;

    @PostMapping(value="/screenings", consumes = "application/json")
    public ResponseEntity<Screening> newScreening(@RequestBody Screening screening) {
        screeningRepository.save(screening);
        return new ResponseEntity<Screening>(screening, HttpStatus.CREATED);
    }

}
