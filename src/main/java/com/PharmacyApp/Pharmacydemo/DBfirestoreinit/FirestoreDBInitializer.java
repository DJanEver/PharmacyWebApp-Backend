package com.PharmacyApp.Pharmacydemo.DBfirestoreinit;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

@Service
public class FirestoreDBInitializer {

    @PostConstruct
    public void initialize(){
        try{

            FileInputStream serviceAccount =  new FileInputStream("C:/Users/hakee/ProgrammingWork/Firebase/");
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
