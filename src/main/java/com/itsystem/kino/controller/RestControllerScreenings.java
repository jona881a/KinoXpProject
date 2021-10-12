package com.itsystem.kino.controller;

import com.itsystem.kino.Model.Screening;
import com.itsystem.kino.Repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerScreenings {

    @Autowired
    ScreeningRepository screeningRepository;

    @GetMapping("/screenings")
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }
}