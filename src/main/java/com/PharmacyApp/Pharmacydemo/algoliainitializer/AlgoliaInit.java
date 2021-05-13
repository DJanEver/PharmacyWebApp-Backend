package com.PharmacyApp.Pharmacydemo.algoliainitializer;
//
//import com.PharmacyApp.Pharmacydemo.model.medication.Medication;
//import com.PharmacyApp.Pharmacydemo.model.medication.MedicationAlgolia;
//import com.algolia.search.DefaultSearchClient;
//import com.algolia.search.SearchClient;
//import com.algolia.search.SearchIndex;
//import com.google.api.core.ApiFuture;
//import com.google.cloud.firestore.DocumentReference;
//import com.google.cloud.firestore.DocumentSnapshot;
//import com.google.cloud.firestore.Firestore;
//import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.ExecutionException;



@Service
public class AlgoliaInit {

//    @PostConstruct
//    public void initializer() throws ExecutionException, InterruptedException {
//
//        List<String> fullAlpha  = new ArrayList<>();
//        List<String> arrayList;
//        MedicationAlgolia medication = new MedicationAlgolia();
//        int partAlphaNum = 0;
////        Medication med;
////          Testing med;
//        Collections.addAll(fullAlpha, "a", "b", "c", "d", "e", "f",
//                "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
//                "s", "t", "u", "v", "w", "x", "y", "z");
//
//        SearchClient client =
//                DefaultSearchClient.create("IP2BXWM9OU", "5d5840bac4283b4414ed87dd4bd30186");
//
//        SearchIndex<MedicationAlgolia> index = client.initIndex("pharmacy_NAME", MedicationAlgolia.class);
//
//            for (int fullAlphaNum = 0; fullAlphaNum < fullAlpha.size(); fullAlphaNum++) {
//                arrayList = firebasePull("A-" +
//                        fullAlpha.get(fullAlphaNum).toUpperCase());
//                if (arrayList != null) {
//                    for (int array = 0; array < arrayList.size(); array++) {
//                        medication.setMedication(arrayList.get(array));
//                        index.saveObject(medication, true);
//                    } // end for
//
//                }// end for
//
//            }// end for
//    }//end initializer
//
//
//    public List <String> firebasePull(String docName) throws
//            ExecutionException, InterruptedException{
//        Firestore dbFirestore = FirestoreClient.getFirestore();
//
//        DocumentReference documentReference = dbFirestore.collection("medication")
//                .document(docName);
//        ApiFuture<DocumentSnapshot> future = documentReference.get();
//        DocumentSnapshot document = future.get();
//        return (List<String>) document.get("medication");
//    }

}
