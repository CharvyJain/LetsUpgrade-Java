package com.company;
import java.util.Scanner;

public class Pilot extends Employee {

    String nameOfAirways;
    int yearsOfExperience;
    String noOfAirplanes;

    public void getdetailsforp() {
		  System.out.println("Enter Name of Airways: ");
		  nameOfAirways = sc.next();
      System.out.println("Enter Years of Experience: ");
		  yearsOfExperience = sc.nextInt();
		  System.out.println("Enter Number of Planes you flown: ");
		  noOfAirplanes = sc.nextInt();
		}

 public void displaydetailsfore() {
		  System.out.println("Name of the Airways: " + nameOfAirways);
		  System.out.println("Years of Experience: " + yearsOfExperience);
		  System.out.println("Number of Planes you flown: " + noOfAirplanes);
		}

}
