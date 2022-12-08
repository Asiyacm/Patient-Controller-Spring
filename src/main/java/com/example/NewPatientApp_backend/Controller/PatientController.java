package com.example.NewPatientApp_backend.Controller;

import com.example.NewPatientApp_backend.Model.Patient;
import com.example.NewPatientApp_backend.dao.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {

    @Autowired
    private PatientDao dao;


    @CrossOrigin (origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> addPatient(@RequestBody Patient p){
        System.out.println(p.getName().toString());
        dao.save(p);
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient> View()
    {
        return (List<Patient>)dao.findAll();
    }

    @CrossOrigin (origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Patient> SearchPatient(@RequestBody Patient p){
        String name = p.getName();
        System.out.println(name);
        return (List<Patient>) dao.SearchPatient(p.getName());
    }

    @CrossOrigin (origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> DeletePatient(@RequestBody Patient p){
        String name = String.valueOf(p.getName());
        System.out.println(name);
        dao.DeletePatient(p.getId());
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;
    }


    }


