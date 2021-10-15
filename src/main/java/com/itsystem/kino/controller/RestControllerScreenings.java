package com.itsystem.kino.controller;

import com.itsystem.kino.model.Screening;
import com.itsystem.kino.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class RestControllerScreenings {

    @Autowired
    ScreeningRepository screeningRepository;

    /**
     * @return a list of all screenings when /screenings is called
     */
    @GetMapping("/screenings")
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    @PostMapping(value="/screeningsCreate",consumes = "application/json")
    public ResponseEntity<Screening> createScreening(@RequestBody Screening screening) {
        screeningRepository.save(screening);

        return new ResponseEntity<Screening>(screening, HttpStatus.CREATED);
    }

}
