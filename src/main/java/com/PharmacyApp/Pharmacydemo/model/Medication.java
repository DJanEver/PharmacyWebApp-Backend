package com.PharmacyApp.Pharmacydemo.model;

import java.util.List;

public class Medication {

    private List<String> medicationName;
//    private Double medicationCost;

    public Medication(){}

    public Medication(List <String> medicationName) {
        this.medicationName = medicationName;
//        this.medicationCost = medicationCost;
    }

    public List <String> getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(List <String> medicationName) {
        this.medicationName = medicationName;
    }

//    public Double getMedicationCost() {
//        return medicationCost;
//    }
//
//    public void setMedicationCost(Double medicationCost) {
//        this.medicationCost = medicationCost;
//    }
}
