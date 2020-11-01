package com.company;
import java.util.Scanner;

public class Engineer extends Employee {

    String nameOfTheCompany;
    int yearsOfExperience;
    String experienceLanguage;

    public void getdetailsfore() {
		  System.out.println("Enter Name of the Company: ");
		  nameOfTheCompany = sc.next();
      System.out.println("Enter Years of Experience: ");
		  yearsOfExperience = sc.nextInt();
		  System.out.println("Enter your experienced Language: ");
		  this.experienceLanguage = sc.next();
		}

 public void displaydetailsfore() {
		  System.out.println("Name of the Company: " + nameOfTheCompany);
		  System.out.println("Years of Experience: " + yearsOfExperience);
		  System.out.println("Experienced Language: " + experienceLanguage);
		}

}
