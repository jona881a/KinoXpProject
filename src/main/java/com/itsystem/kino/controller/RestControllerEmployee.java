package com.itsystem.kino.controller;

import com.itsystem.kino.model.Employee;
import com.itsystem.kino.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(allowedHeaders = "Access-Control-Allow-Origin")
@RestController
public class RestControllerEmployee {

    @Autowired
    EmployeeRepository employeeRepository;
    /**
     * @return a list of all employees when /employees  is called
     */
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
