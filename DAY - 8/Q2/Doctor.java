package com.company;
import java.util.Scanner;

public class Doctor extends Employee {

    String hospitalName;
    int yearsOfExperience;
    String specialist;

    public void getdetailsford() {
	System.out.println("Enter Hospital Name: ");
	hospitalName = sc.next();
      	System.out.println("Enter Years of Experience: ");
	yearsOfExperience = sc.nextInt();
	System.out.println("Enter your specific field: ");
	specialist = sc.next();
    }
    public void displaydetailsford() {
	System.out.println("Hospital Name: " + hospitalName);
	System.out.println("Years of Experience: " + yearsOfExperience);
	System.out.println("Specialist in: " + specialist);
		}
}
