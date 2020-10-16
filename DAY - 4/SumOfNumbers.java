package com.question3;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 Values: ");
        
        int a[] = new int[5];
        int sum = 0;
        
        for(int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<5; i++)
        {
            sum = sum + a[i];
        }
        
        System.out.println("Sum of the Entered Values are: "+sum);
        
    }
}
