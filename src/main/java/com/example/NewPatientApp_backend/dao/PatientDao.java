package com.example.NewPatientApp_backend.dao;

import com.example.NewPatientApp_backend.Model.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `address`, `dateofapmt`, `dname`, `mobile`, `name` FROM `patient` WHERE `name`LIKE %:name%", nativeQuery = true)

    List<Patient>SearchPatient(@Param("name") String name);
}
