package com.question1;

public class Main {

    public static void main(String[] args) {
        Avenger[] avengers = new Avenger[5];

        for(int i =0; i< 5;i++){
            avengers[i] = new Avenger();
            avengers[i].getDetails();
        }

        for(int j=0; j < 5 ; j++){
            avengers[j].displayDetails();
        }
    }
}
