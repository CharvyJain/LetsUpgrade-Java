package com.company;

public class Main {

    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[3];
        Engineer[] engineers = new Engineer[3];
        Pilot[] pilots = new Pilot[3];

        for (int i=0; i<3; i++){
            doctors[i] = new Doctor();
            engineers[i] = new Engineer();
            pilots[i] = new Pilot();
        }

        //DOCTOR
        for (int i=0; i<3; i++){
            doctors[i].getDetails();
            doctors[i].getdetailsford();
        }

                
        //ENGINNER
        for (int i=0; i<3; i++){
            engineers[i].getDetails();
            engineers[i].getdetailsfore();
        }


        //PILOT
 
        for (int i=0; i<3; i++){
            pilots[i].getDetails();
            pilots[i].getdetailsforp();
        }

        //Printing Doctors Details
        for (int i=0; i<3; i++){
            doctors[i].displayDetails();
            doctors[i].displaydetailsford();
        } 
        
        //Printing Engineers Details
        for (int i=0; i<3; i++){
            engineers[i].displayDetails();
            doctors[i].displaydetailsfore();
        }

        //Printing Pilots Details
        for (int i=0; i<3; i++){
            engineers[i].displayDetails();
             doctors[i].displaydetailsforp();
        }

    }
}
