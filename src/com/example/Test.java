package com.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Patient[] patientList = new Patient[2];
        Scanner scanner = new Scanner(System.in);
        boolean entering = true;
        while (entering){
            displayMenu();
            int operation = scanner.nextInt();
            switch (operation){
                case 1:
                    boolean isArrayFull = true;
                    for (int i =0 ; i< patientList.length; i++){
                        if(patientList[i] == null){
                            isArrayFull = false;
                           break;}}
                    if(isArrayFull){
                        System.out.println("array is full...");
                    }
                    else {
                        for(int i = 0 ; i<patientList.length; i++){
                            Patient patient = new Patient();
                            System.out.println("Please enter the information of patients");
                            System.out.println("ID");
                            patient.setPatientId(scanner.nextInt());
                            System.out.println("Full Name");
                            patient.setFullName(scanner.next());
                            System.out.println("Age");
                            patient.setAge(scanner.nextInt());
                            System.out.println("Diagnosis");
                            patient.setDiagnosis(scanner.next());
                            patientList[i] = patient;
                            System.out.println(" ID: " + patient.getPatientId() + "\n Full name: " + patient.getFullName() +
                                    "\n Age: " + patient.getAge() + "\n Diagnosis: " + patient.getDiagnosis());

                        }
                        }
                    break;

                case 2:
                    for(Patient patient: patientList){
                        if(patient!= null){
                            patient.printInfo();
                            System.out.println(" ");
                    }
                         else if (patient == null) {
                            System.out.println("There isn't any patient in that hospital... ");
                            break;
                    }
                    }
                    break;
                case 3:
                    entering = false;
                    System.out.println("......program is closing......");
                    break;

            }
        }

    }
    public static void displayMenu(){
        System.out.println("A sample hospital information system is running now... \n MENU OPTIONS [1 through 3]: \n " +
                "*** Press 1 to store information *** \n *** Press 2 to print information *** \n" +
                "*** Press 3 to terminate the program *** \n Your choice ?");
    }
}
