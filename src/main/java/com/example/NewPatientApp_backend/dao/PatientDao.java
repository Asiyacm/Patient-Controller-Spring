package com.example.NewPatientApp_backend.dao;

import com.example.NewPatientApp_backend.Model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patient,Integer> {
}
