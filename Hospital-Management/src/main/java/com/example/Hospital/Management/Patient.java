package com.example.Hospital.Management;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int patientId;
    private String name;
    private String doctorName;
    private List<Hospital> listOfHospital;

    public Patient() {
    }

    public Patient(int patientId, String name, String doctorName) {
        this.patientId = patientId;
        this.name = name;
        this.doctorName = doctorName;
        this.listOfHospital = new ArrayList<>();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public List<Hospital> getListOfHospital() {
        return listOfHospital;
    }

    public void setListOfHospital(List<Hospital> listOfHospital) {
        this.listOfHospital = listOfHospital;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", listOfHospital=" + listOfHospital +
                '}';
    }
}
