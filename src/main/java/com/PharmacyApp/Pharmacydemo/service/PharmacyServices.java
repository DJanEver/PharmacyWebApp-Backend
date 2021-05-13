package com.PharmacyApp.Pharmacydemo.service;

import com.PharmacyApp.Pharmacydemo.exception.pharmacyexceptions.PharmacyIDAlreadyExist;
import com.PharmacyApp.Pharmacydemo.exception.pharmacyexceptions.PharmacyIDDoesNotExist;
import com.PharmacyApp.Pharmacydemo.exception.pharmacyexceptions.PharmacyInvalidPassword;
import com.PharmacyApp.Pharmacydemo.model.Pharmacy;
import org.springframework.stereotype.Service;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;


import java.util.concurrent.ExecutionException;

@Service
public class PharmacyServices {

    public static final String COL_NAME = "pharmacy_accounts";

    public void pharmacistIdCheck(Pharmacy pharmacist) throws
            InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();

        CollectionReference pharmacyAccounts = dbFirestore.collection(COL_NAME);

        Query query = pharmacyAccounts.whereEqualTo("pharmacistID", pharmacist.getPharmacistID());
        ApiFuture<QuerySnapshot> querySnapshot = query.get();

        for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
            throw new PharmacyIDAlreadyExist();
        }// end for
    }

    public void savePharmacyDetails(Pharmacy pharmacist) throws
            InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();

        pharmacistIdCheck(pharmacist);
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME)
                .document(pharmacist.getPharmacistID()).set(pharmacist);
    }

    public void pharmacyIdAndPassCheck(String ID, String password) throws
            InterruptedException, ExecutionException{
        Firestore dbFirestore = FirestoreClient.getFirestore();

        Pharmacy pharmacist = null;
        DocumentReference documentReference = dbFirestore.collection(COL_NAME)
                .document(ID);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        if(!document.exists()){
            throw new PharmacyIDDoesNotExist();
        }

        pharmacist = document.toObject(Pharmacy.class);
        assert pharmacist != null;

        if(!pharmacist.getPassword().equals(password)){
            throw new PharmacyInvalidPassword();
        }
    }
}