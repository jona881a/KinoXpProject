package com.itsystem.kino.controller;

import com.itsystem.kino.model.Room;
import com.itsystem.kino.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerRooms {

        @Autowired
        RoomRepository roomRepository;

        /**
         * @return a list of all rooms when /rooms is called
         */
        @GetMapping("/rooms")
        public List<Room> getAllRooms() {
            return roomRepository.findAll();
        }
}
