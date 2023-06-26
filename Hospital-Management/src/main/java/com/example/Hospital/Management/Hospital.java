package com.example.Hospital.Management;

public class Hospital {
    private int hospitalId;
    private String name;

    public Hospital() {
    }

    public Hospital(int hospitalId, String name) {
        this.hospitalId = hospitalId;
        this.name = name;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", name='" + name + '\'' +
                '}';
    }
}
