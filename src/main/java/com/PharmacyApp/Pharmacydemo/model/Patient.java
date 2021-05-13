package com.PharmacyApp.Pharmacydemo.model;

public class Patient {

    public String patientGovId;
    public String patientFirstName;
    public String patientLastName;
    public String phoneNumber;

    public Patient(){}

    public Patient(String patientGovId, String patientFirstName, String patientLastName, String phoneNumber) {
        this.patientGovId = patientGovId;
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.phoneNumber = phoneNumber;
    }

    public String getPatientGovId() {
        return patientGovId;
    }

    public void setPatientGovId(String patientGovId) {
        this.patientGovId = patientGovId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
