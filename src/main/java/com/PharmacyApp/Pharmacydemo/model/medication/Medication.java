package com.PharmacyApp.Pharmacydemo.model.medication;

import java.util.List;

public class Medication {

        private List<String> medication;


        public Medication(){}

        public Medication(List <String> medication ) {
            this.medication = medication;

        }

        public List <String> getMedication() {
            return this.medication;
        }

        public void setMedication(List <String> medication ) {
            this.medication = medication;
        }

    }

