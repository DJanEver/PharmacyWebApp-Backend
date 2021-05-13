package com.PharmacyApp.Pharmacydemo.exceptioncontroller;


import com.PharmacyApp.Pharmacydemo.exception.pharmacyexceptions.PharmacyIDAlreadyExist;
import com.PharmacyApp.Pharmacydemo.exception.pharmacyexceptions.PharmacyIDDoesNotExist;
import com.PharmacyApp.Pharmacydemo.exception.pharmacyexceptions.PharmacyInvalidPassword;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PharmacyExceptionController {

    @ExceptionHandler(value = PharmacyIDAlreadyExist.class)
    public ResponseEntity<Object> exception(PharmacyIDAlreadyExist exception){
        return new ResponseEntity<>("Doctor ID Already Registered", HttpStatus.ALREADY_REPORTED);
    }

    @ExceptionHandler(value = PharmacyIDDoesNotExist.class)
    public ResponseEntity<Object> exception(PharmacyIDDoesNotExist exception){
        return new ResponseEntity<>("Pharmacy ID Does Not Exist", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = PharmacyInvalidPassword.class)
    public ResponseEntity<Object> exception(PharmacyInvalidPassword exception){
        return new ResponseEntity<>("Invalid Password", HttpStatus.NOT_FOUND);
    }
}
