package com.itsystem.kino.Controller;

import com.itsystem.kino.model.Screening;
import com.itsystem.kino.repository.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}
