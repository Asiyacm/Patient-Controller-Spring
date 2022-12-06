package com.example.NewPatientApp_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/add")
    public String addPatient(){
        return "patient add page";
    }
    @GetMapping("/view")
    public String viewPatient(){
        return "patient view page";
    }
}
