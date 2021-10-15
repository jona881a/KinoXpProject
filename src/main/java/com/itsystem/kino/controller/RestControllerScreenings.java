package com.itsystem.kino.controller;

import com.itsystem.kino.model.Screening;
import com.itsystem.kino.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowedHeaders = "Access-Control-Allow-Origin. *")
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

    @PostMapping("/screeningsCreate")
    public Screening screeningsCreate(@ModelAttribute Screening screening) {
        return screeningRepository.save(screening);
    }
    /*
    @PostMapping(value="/region",consumes = "application/json")
    public ResponseEntity<Region> createRegion(@RequestBody Region region) {
        regionRepository.save(region);

        return new ResponseEntity<Region>(region, HttpStatus.CREATED);
    }

     */
}
