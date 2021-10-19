package com.itsystem.kino.controller;

import com.itsystem.kino.model.Screening;
import com.itsystem.kino.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
        List<Screening> dateScreening = screeningRepository.findAll();
        List<Screening> newScreenings = new ArrayList<>();

        for (Screening scr : dateScreening) {
            Date dt = scr.getEndTime();
            Date today = new Date();
            int compared = dt.compareTo(today);
            if (compared > 0) {
                newScreenings.add(scr);
            }
        }
        return newScreenings;
    }

    @PostMapping(value="/screeningsCreate",consumes = "application/json")
    public ResponseEntity<Screening> createScreening(@RequestBody Screening screening) {
        screeningRepository.save(screening);

        return new ResponseEntity<Screening>(screening, HttpStatus.CREATED);
    }

    @GetMapping("/screenings/{screeningID}")
    public Screening getKommune(@PathVariable int screeningID) {
        Optional<Screening> screeningObj = screeningRepository.findById(screeningID);
        if (screeningObj.isPresent()) {
            return screeningObj.get();
        }
        Screening screening= new Screening();
        screening.setScreeningID(-1);
        return screening;
    }
    @PutMapping("/screenings/{screeningID}")
    public ResponseEntity<Screening> updateScreening(@PathVariable int screeningID, @RequestBody Screening screening){
        var screeningObj = screeningRepository.findById(screeningID);

        screeningRepository.save(screening);
        return new ResponseEntity<>(screening, HttpStatus.OK);
    }
}
