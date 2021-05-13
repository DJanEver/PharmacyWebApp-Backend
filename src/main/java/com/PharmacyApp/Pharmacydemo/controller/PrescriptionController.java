package com.PharmacyApp.Pharmacydemo.controller;

import com.PharmacyApp.Pharmacydemo.service.PrescriptionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class PrescriptionController {

    @Autowired
    PrescriptionServices prescription;


//WEB SCRAPER GET REQUEST.
//    @GetMapping("/medication")
//    public ResponseEntity<String>medicationListing()throws
//             InterruptedException, ExecutionException{
//        prescription.medicationGeneration();
//        return new ResponseEntity<>("Done.", HttpStatus.OK);
//    }

}
