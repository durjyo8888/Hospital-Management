package com.example.Hospital.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HospitalController {
    @Autowired
    HospitalService hospitalService;

    @PostMapping("/add_patient")
    public ResponseEntity<String> addPatient(@RequestBody Patient patient){
        String s = hospitalService.addPatient(patient);
        if(s != null){
            return new ResponseEntity("Patient added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Patient already exist", HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/add_doctor")
    public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor){
        String s = hospitalService.addDoctor(doctor);
        if(s != null){
            return new ResponseEntity("Doctor added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Doctor already exist", HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/add_hospital")
    public ResponseEntity<String> addHospital(@RequestBody Hospital hospital){
        String s = hospitalService.addHospital(hospital);
        if(s != null){
            return new ResponseEntity("Hospital added successfully", HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Hospital already exist", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/list_Of_patient")
    public ResponseEntity<List<Patient>> getAllPatient(){
        List<Patient> patientList = hospitalService.getAllPatient();
        return new ResponseEntity(patientList, HttpStatus.FOUND);
    }
    @GetMapping("/list_Of_hospital")
    public ResponseEntity<List<Hospital>> getAllHospital(){
        List<Hospital> hospitalsList = hospitalService.getAllHospital();
        return new ResponseEntity(hospitalsList, HttpStatus.FOUND);
    }
    @GetMapping("/patient_size")
    public ResponseEntity<Integer> doctorWithMostNoOfPatient(){
        int doctor = hospitalService.doctorWithMostNoOfPatient();
        return new ResponseEntity(doctor,HttpStatus.FOUND);
    }
    @GetMapping("/patient_most_visited_hospital")
    public ResponseEntity<String> patientWhoMostVisitedHospital(){
        String patient = hospitalService.patientWhoMostVisitedHospital();
        return new ResponseEntity(patient, HttpStatus.FOUND);
    }
}
