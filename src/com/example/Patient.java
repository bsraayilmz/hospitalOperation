package com.example;

public class Patient {
    private int patientId;
    private String fullName;
    private int age;
    private String diagnosis;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void printInfo(){
        System.out.println("patient's ID: " + getPatientId());
        System.out.println("patient's full name: " + getFullName());
        System.out.println("patient's age: " + getAge());
        System.out.println("patient's diagnosis: " + getDiagnosis());
    }
}
