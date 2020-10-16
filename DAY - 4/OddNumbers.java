package com.question2;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = 98;
        numbers[1] = 56;
        numbers[2] = 13;
        numbers[3] = 81;
        numbers[4] = 39;

        System.out.println("Odd numbers are : ");
        for(int i = 0; i < 5; i++){
            if(numbers[i] % 2 != 0){
                System.out.println(numbers[i]);
            }
        }

    }
}
