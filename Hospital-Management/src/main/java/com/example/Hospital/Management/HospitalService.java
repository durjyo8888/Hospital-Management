package com.example.Hospital.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    @Autowired
    HospitalRepository hospitalRepository;

    public String addPatient(Patient patient) {
        return hospitalRepository.addPatient( patient);
    }

    public String addDoctor(Doctor doctor) {
        return hospitalRepository.addDoctor(doctor);
    }

    public String addHospital( Hospital hospital) {
        return hospitalRepository.addHospital(hospital);
    }

    public List<Patient> getAllPatient() {
        return hospitalRepository.getAllPatient();
    }

    public List<Hospital> getAllHospital() {
        return hospitalRepository.getAllHospital();
    }

    public int doctorWithMostNoOfPatient() {
        return hospitalRepository.doctorWithMostNoOfPatient();
    }

    public String patientWhoMostVisitedHospital() {
        return hospitalRepository.patientWhoMostVisitedHospital();
    }
}
