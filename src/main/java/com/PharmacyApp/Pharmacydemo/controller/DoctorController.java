package com.PharmacyApp.Pharmacydemo.controller;

import com.PharmacyApp.Pharmacydemo.model.Doctor;
import com.PharmacyApp.Pharmacydemo.service.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class DoctorController {

    @Autowired
    DoctorServices doctorServices;

    @GetMapping("/testingBE")
    public String testingBE(){
        return doctorServices.testBE();
    }


    @PostMapping("/create_doctor")
    public ResponseEntity<String> createDoctor(@RequestBody Doctor doctor) throws
            InterruptedException, ExecutionException {
        doctorServices.saveDoctorDetails(doctor);
        return new ResponseEntity<>("Data Saved", HttpStatus.OK);
    }

    @GetMapping("/doctor_login")
    public ResponseEntity<String> doctorLogin(@RequestParam String ID, @RequestParam String password) throws
            InterruptedException, ExecutionException{

        doctorServices.doctorRegIdAndPassCheck(ID, password);
        return new ResponseEntity<>("Login Completed", HttpStatus.OK);
    }

}
