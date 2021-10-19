package com.itsystem.kino.controller;

import com.itsystem.kino.model.History;
import com.itsystem.kino.model.Screening;
import com.itsystem.kino.repository.HistoryRepository;
import com.itsystem.kino.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(allowedHeaders = "Access-Control-Allow-Origin")
@RestController
public class RestControllerHistory {

    @Autowired
    ScreeningRepository historyRepository;

    @GetMapping("/histories")
    public List<Screening> getAllHistory(){
        List<Screening> dateScreening = historyRepository.findAll();
        List<Screening> newScreenings = new ArrayList<>();

        for (Screening scr : dateScreening) {
            Date dt = scr.getEndTime();
            Date today = new Date();
            int compared = dt.compareTo(today);
            if (compared < 0) {
                newScreenings.add(scr);
            }
        }
        return newScreenings;
    }

}
