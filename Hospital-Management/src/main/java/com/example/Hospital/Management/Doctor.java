package com.example.Hospital.Management;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private int doctorId;
    private String name;
    private List<Patient> patientList;

    public Doctor() {
    }

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        this.patientList = new ArrayList<>();
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                ", patientList=" + patientList +
                '}';
    }
}
