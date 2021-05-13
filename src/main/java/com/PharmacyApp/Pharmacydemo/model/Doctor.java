package com.PharmacyApp.Pharmacydemo.model;


public class Doctor {

    private String doctorGovId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private String conformationPassword;

    public Doctor(){}

    public Doctor(String doctorGovId, String firstName, String lastName, String phoneNumber
    , String password, String conformationPassword) {
        this.doctorGovId = doctorGovId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.conformationPassword = conformationPassword;
    }

    public String getDoctorGovId() {
        return doctorGovId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConformationPassword() {
        return conformationPassword;
    }

    public void setConformationPassword(String conformationPassword) {
        this.conformationPassword = conformationPassword;
    }

    public void setDoctorGovId(String doctorGovId) {
        this.doctorGovId = doctorGovId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
