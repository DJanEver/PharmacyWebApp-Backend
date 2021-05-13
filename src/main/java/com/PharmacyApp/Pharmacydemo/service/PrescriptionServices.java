package com.PharmacyApp.Pharmacydemo.service;

//import org.openqa.selenium.WebElement;
import com.PharmacyApp.Pharmacydemo.model.Patient;
        import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;


        import java.util.concurrent.ExecutionException;

@Service
public class PrescriptionServices {

    public static final String COL_NAME = "patient_accounts";
//    public static final String COL_MED_NAME = "medication";

    private static final Logger log = LoggerFactory.getLogger(PrescriptionServices.class);

    public Boolean patientSearch(String patientID) throws
            InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();

        DocumentReference documentReference = dbFirestore.collection(COL_NAME)
                .document(patientID);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        return document.exists();
    }

    public void savePatientDetails(Patient patient) throws
            InterruptedException, ExecutionException{
        Firestore dbFirestore = FirestoreClient.getFirestore();

        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME)
                .document(patient.getPatientGovId()).set(patient);
    }


//WEB SCRAPER STUFF.

//
//    public void generateVMedication(Patient patient) throws
//            InterruptedException, ExecutionException{
//
//        if(!patientSearch(patient.patientGovId)){
//            savePatientDetails(patient);
//        }// end if
//
//    }
//
//    //    web scarper from A-Z
//    public void medicationGeneration() throws  InterruptedException, ExecutionException{
//        boolean flag = false;
//        List<String> navigationList = new ArrayList<>();
//
//        List <String> letterFromA = new ArrayList<>();
//        List <String> letterFromL = new ArrayList<>();
//
//        String buttonPathList;
//        int navList = 0;
//
//        Collections.addAll(letterFromL,        "t",
//                "u", "v", "w", "x", "y", "z");
//
//        Collections.addAll(letterFromA,  "a", "b", "c", "d", "e", "f", "g", "h", "i","j", "k", "l", "m",
//                "n", "o", "p", "q", "r", "s", "t",
//                "u", "v", "w", "x", "y", "z");
//
//        Collections.addAll(navigationList,
//
//                "https://www.drugs.com/alpha/t.html", "https://www.drugs.com/alpha/u.html",
//                "https://www.drugs.com/alpha/v.html", "https://www.drugs.com/alpha/w.html",
//                "https://www.drugs.com/alpha/x.html", "https://www.drugs.com/alpha/y.html",
//                "https://www.drugs.com/alpha/z.html");
//
//        while(navList < navigationList.size()){
//            for(int letterFL = 0; letterFL < letterFromL.size(); letterFL++){
//                for(int letterFA = 0; letterFA < letterFromA.size(); letterFA++){
//                    buttonPathList = "//*[@id=\"letter-"+letterFromL.get(letterFL) + letterFromA.get(letterFA) + "\"]";
//                    List<String> list = scrapper(buttonPathList, navigationList.get(navList));
//                    saveMeds(buttonPathList.substring(9, 18), list);
//                }// end for
//                navList++;
//            }// end for
//        }// end while
//
//    }// end function
//
//
//    public void saveMeds(String document, List<String> medications) throws
//            InterruptedException, ExecutionException{
//        Medication meds = new Medication();
//        Firestore dbFirestore = FirestoreClient.getFirestore();
//
//        meds.setMedication(medications);
//
//        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_MED_NAME)
//                .document(document).set(meds);
//
//    }//end
//
//    public List <String> scrapper(String btnPath, String nav)throws InterruptedException, ExecutionException{
//        System.setProperty("webdriver.gecko.driver", "C:/Users/hakee/ProgrammingWork/Java/Pharmacy-demo/Pharmacy-demo/geckodriver.exe");
//
//        FirefoxDriver driver = new FirefoxDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//
//        String buttonXpath = btnPath;
//
//        driver.navigate().to(nav);
//
//        //making sure the element is loaded before we click it.
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(buttonXpath)));
//
//        //Clicking the button
//        driver.findElement(By.xpath(buttonXpath)).click();
//
//
//        //Making sure the Content we want to copy is loaded
//        String listXpath = "//*[@id=\"content\"]/div[2]/ul";
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(listXpath)));
//
//        //Making a list of names
////        WebElement name = driver.findElements(By.xpath(paragraphXpath));
//        List<WebElement> medicationList =
//                driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/ul//li/a"));
//
//
//        //might make a list of elements instead of making it into one string.
////        String medication = driver.findElement(By.xpath(listXpath)).getText();
//
//        List<String> medication = new ArrayList<>();
//        for (int ele = 0; ele < medicationList.size(); ele++) {
//
//            medication.add(ele, medicationList.get(ele).getText());
//        }
//
//        //Size == 230.
//        //closes window
//        driver.close();
//
//        return medication;
//    }

}
