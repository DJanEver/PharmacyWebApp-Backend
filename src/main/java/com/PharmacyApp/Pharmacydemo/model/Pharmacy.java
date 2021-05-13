package com.PharmacyApp.Pharmacydemo.model;

public class Pharmacy {

    private String pharmacyName;
    private String pharmacistID;
    private String phoneNumber;
    private String password;
    private String conformationPassword;

    public Pharmacy(){}

    public Pharmacy(String pharmacyName, String pharmacistID, String phoneNumber, String password,
                    String conformationPassword) {
        this.pharmacyName = pharmacyName;
        this.pharmacistID = pharmacistID;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.conformationPassword = conformationPassword;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmacistID() {
        return pharmacistID;
    }

    public void setPharmacistID(String pharmacistID) {
        this.pharmacistID = pharmacistID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
}
