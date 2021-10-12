package com.itsystem.kino.Controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping ("/")
    public String Index() {

        return "index.html";
    }


}
