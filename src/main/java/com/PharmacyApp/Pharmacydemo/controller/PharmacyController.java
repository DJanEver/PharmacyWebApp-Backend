package com.PharmacyApp.Pharmacydemo.controller;

import com.PharmacyApp.Pharmacydemo.model.Pharmacy;
import com.PharmacyApp.Pharmacydemo.service.PharmacyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class PharmacyController {

    @Autowired
    PharmacyServices pharmacyServices;

    @PostMapping("/create_pharmacy")
    public ResponseEntity<String> createPharmacy(@RequestBody Pharmacy pharmacist) throws
            InterruptedException, ExecutionException {
        pharmacyServices.savePharmacyDetails(pharmacist);
        return new ResponseEntity<>("Data Saved", HttpStatus.OK);
    }
    @GetMapping("/pharmacy_login")
    public ResponseEntity<String> pharmacyLogin(@RequestParam String ID, @RequestParam String password) throws
            InterruptedException, ExecutionException{
        pharmacyServices.pharmacyIdAndPassCheck(ID, password);
        return new ResponseEntity<>("Login Completed", HttpStatus.OK);
    }
}
