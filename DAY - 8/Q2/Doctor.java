package com.company;
import java.util.Scanner;

public class Doctor extends Employee {

    String hospitalName;
    int yearsOfExperience;
    String specialist;

    public void getdetailsford() {
		  System.out.println("Enter Hospital Name: ");
		  this.hospitalName = sc.next();
      System.out.println("Enter Years of Experience: ");
		  this.yearsOfExperience = sc.nextInt();
		  System.out.println("Enter your specific field: ");
		  this.specialist = sc.next();
	
	}
}
