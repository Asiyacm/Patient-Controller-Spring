package com.example.NewPatientApp_backend.Controller;

import com.example.NewPatientApp_backend.Model.Patient;
import com.example.NewPatientApp_backend.dao.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientDao dao;


    @CrossOrigin (origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addPatient(@RequestBody Patient p){
        System.out.println(p.getName().toString());
        dao.save(p);
        return "patient add page";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient> View()
    {
        return (List<Patient>)dao.findAll();
    }
    }


