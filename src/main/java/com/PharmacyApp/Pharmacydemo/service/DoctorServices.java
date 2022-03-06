package com.PharmacyApp.Pharmacydemo.service;

import com.PharmacyApp.Pharmacydemo.exception.doctorexceptions.DoctorIDAlreadyExist;
import com.PharmacyApp.Pharmacydemo.exception.doctorexceptions.DoctorIDDoesNotExist;
import com.PharmacyApp.Pharmacydemo.exception.doctorexceptions.DoctorInvalidPassword;
import com.PharmacyApp.Pharmacydemo.model.Doctor;
import org.springframework.stereotype.Service;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;

import java.util.concurrent.ExecutionException;

@Service
public class DoctorServices {

   public static final String COL_NAME = "doctor_accounts";

    public String testBE(){
        return "<h1> Hello World </h1>";
    }

    public void doctorIDCheck(Doctor doctor) throws
            InterruptedException, ExecutionException{
        Firestore dbFirestore = FirestoreClient.getFirestore();

        DocumentReference documentReference = dbFirestore.collection(COL_NAME)
                .document(doctor.getDoctorGovId());
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        if(document.exists()){
            throw new DoctorIDAlreadyExist();
        }
    }

    public void saveDoctorDetails(Doctor doctor) throws
            InterruptedException, ExecutionException{

        Firestore dbFirestore = FirestoreClient.getFirestore();

        doctorIDCheck(doctor);
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME)
                .document(doctor.getDoctorGovId()).set(doctor);
    }

    public void doctorRegIdAndPassCheck(String ID, String password) throws
            InterruptedException, ExecutionException{
        Firestore dbFirestore = FirestoreClient.getFirestore();

        Doctor doctor = null;
        DocumentReference documentReference = dbFirestore.collection(COL_NAME)
                .document(ID);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        if(!document.exists()){
            throw new DoctorIDDoesNotExist();
        }

        doctor = document.toObject(Doctor.class);
        assert doctor != null;

        if(!doctor.getPassword().equals(password)){
            throw new DoctorInvalidPassword();
        }
    }

}
