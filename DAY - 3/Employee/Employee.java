package com.employee_salary;
import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);

    String name;
    int dob,mob,yob,monthly_salary,annual_salary;
    double taxAmount;

    public void Details(){

        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.print("Enter your Date of Birth : ");
        dob = sc.nextInt();
        System.out.print("Enter your Month of Birth : ");
        mob = sc.nextInt();
        System.out.print("Enter your Year of Birth : ");
        yob = sc.nextInt();
        System.out.print("Enter your Monthly Salary : ");
        monthly_salary = sc.nextInt();
    }

    public void display(){

        
        System.out.println("Employee Name : "+name);
        int age = 2020-yob;
        System.out.println("Employee Age : "+age);
        annual_salary = monthly_salary*12;
        System.out.println("Employee Annual Salary : "+annual_salary);

        if(annual_salary>500000){
            taxAmount = annual_salary * 0.20;
        }
        else if(annual_salary>400000){
            taxAmount = annual_salary * 0.15;
        }
        else if(annual_salary>300000){
            taxAmount = annual_salary * 0.10;
        }
        else if(annual_salary>200000){
            taxAmount = annual_salary * 0.05;
        }else {
            taxAmount = 0;
        }

        System.out.println("Employee Tax Amount : "+taxAmount);

    }
}
