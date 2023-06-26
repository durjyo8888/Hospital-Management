package com.example.Hospital.Management;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class HospitalRepository {
    HashMap<Integer,Patient> patientDb = new HashMap<>();
    HashMap<Integer,Doctor> doctorDb = new HashMap<>();
    HashMap<Integer,Hospital> hospitalDb = new HashMap<>();
    public String addPatient( Patient patient) {
        if(patientDb.containsKey(patient)){
            return null;
        }
        patientDb.put(patient.getPatientId(),patient);
        return patient.toString();
    }

    public String addDoctor( Doctor doctor) {
        if(doctorDb.containsKey(doctor)){
            return null;
        }
        doctorDb.put(doctor.getDoctorId(), doctor);
        return doctor.toString();
    }

    public String addHospital( Hospital hospital) {
        if(hospitalDb.containsKey(hospital)){
            return null;
        }
        hospitalDb.put(hospital.getHospitalId(),hospital);
        return hospital.toString();
    }

    public List<Patient> getAllPatient() {
        List<Patient> list = new ArrayList<>();
        for(Integer patientId : patientDb.keySet()){
            list.add(patientDb.get(patientId));
        }
        return list;
    }

    public List<Hospital> getAllHospital() {
        List<Hospital> hospitals = new ArrayList<>();
        for(Integer hospitalId : hospitalDb.keySet()){
            hospitals.add(hospitalDb.get(hospitalId));
        }
        return hospitals;
    }

    public int doctorWithMostNoOfPatient() {
        int maxSize = 0, size = 0,doctor = 0;
        for(Integer doctorId : doctorDb.keySet()){
             size = doctorDb.get(doctorId).getPatientList().size();
             if(maxSize < size){
                 maxSize = Math.max(maxSize,size);
                  doctor = doctorDb.get(doctorId).getDoctorId();
             }

        }
        return doctor;
    }

    public String patientWhoMostVisitedHospital() {
        int maxSize = 0, size = 0;
        String patient = "";
        for(Integer patientId : patientDb.keySet()){
            size = patientDb.get(patientId).getListOfHospital().size();
            if(maxSize < size){
                maxSize = Math.max(maxSize,size);
                patient = patientDb.get(patientId).getName();
            }

        }
        return patient;
    }
}
