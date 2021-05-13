package com.PharmacyApp.Pharmacydemo.exceptioncontroller;

import com.PharmacyApp.Pharmacydemo.exception.doctorexceptions.DoctorIDAlreadyExist;
import com.PharmacyApp.Pharmacydemo.exception.doctorexceptions.DoctorIDDoesNotExist;
import com.PharmacyApp.Pharmacydemo.exception.doctorexceptions.DoctorInvalidPassword;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DoctorExceptionController {

    @ExceptionHandler(value = DoctorIDAlreadyExist.class)
    public ResponseEntity<Object> exception(DoctorIDAlreadyExist exception){
        return new ResponseEntity<>("Doctor ID Already Registered", HttpStatus.ALREADY_REPORTED);
    }

    @ExceptionHandler(value = DoctorIDDoesNotExist.class)
    public ResponseEntity<Object> exception(DoctorIDDoesNotExist exception){
        return new ResponseEntity<>("Doctor ID Does Not Exist", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = DoctorInvalidPassword.class)
    public ResponseEntity<Object> exception(DoctorInvalidPassword exception){
        return new ResponseEntity<>("Invalid Password", HttpStatus.NOT_FOUND);
    }
}
