package com.itsystem.kino.controller;

import com.itsystem.kino.model.History;
import com.itsystem.kino.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(allowedHeaders = "Access-Control-Allow-Origin")
@RestController
public class RestControllerHistory {

    @Autowired
    HistoryRepository historyRepository;

    @GetMapping("/histories")
    public List<History> getAllHistory(){
        return historyRepository.findAll();
    }

}
