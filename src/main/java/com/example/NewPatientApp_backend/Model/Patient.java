package com.example.NewPatientApp_backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  int id;
    private String name;
    private String address;
    private String mobile;
    private String dateofapmt;
    private String dname;

    public Patient() {
    }

    public Patient(int id, String name, String address, String mobile, String dateofapmt, String dname) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.dateofapmt = dateofapmt;
        this.dname = dname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDateofapmt() {
        return dateofapmt;
    }

    public void setDateofapmt(String dateofapmt) {
        this.dateofapmt = dateofapmt;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
