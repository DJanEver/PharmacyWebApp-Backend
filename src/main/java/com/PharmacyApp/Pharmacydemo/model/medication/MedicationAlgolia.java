package com.PharmacyApp.Pharmacydemo.model.medication;

import java.util.List;

public class MedicationAlgolia {
    private String medication;


    public MedicationAlgolia (){}

    public MedicationAlgolia (String medication ) {
        this.medication = medication;

    }

    public String getMedication() {
        return this.medication;
    }

    public void setMedication(String medication ) {
        this.medication = medication;
    }
}
