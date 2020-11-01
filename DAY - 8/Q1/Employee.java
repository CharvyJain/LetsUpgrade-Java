package com.company;
import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private int salary;
    private String designation;

    public void getDetails() {
        System.out.println("Enter Employee's Name: ");
		    name = sc.nextLine();
		    System.out.println("Enter Employee's Age: ");
		    age = sc.nextInt();
		    System.out.println("Enter Employee's Salary: ");
		    salary = sc.nextInt();
	      System.out.println("Enter Employee's Designation: ");
		    designation = sc.next();
    }

    public void displayDetails(){
      System.out.println("Employee's Name is "+name);
		  System.out.println("Employee's Age is "+age);
		  System.out.println("Employee's Salary is "+salary);
		  System.out.println("Employee's Designation is "+destination);
	}
    }


