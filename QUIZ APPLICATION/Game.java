package com.quizapp;

import com.quizapp.Player;
import com.quizapp.Question;

public class Game
{
    Question[] questions = new Question[10];
    Player player = new Player();

    String[] questionsData =
            {
                    "\nQ1. Which of the following is not a Java features?",
                    "\nQ2. _____ is used to find and fix bugs in the Java programs.",
                    "\nQ3. Which of the following is a valid declaration of a char?",
                    "\nQ4. What is the return type of the hashCode() method in the Object class?",
                    "\nQ5. Which of the following is a valid long literal?",
                    "\nQ6. What does the expression float a = 35 / 0 return?",
                    "\nQ7. Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?",
                    "\nQ8. Which of the following for loop declaration is not valid?",
                    "\nQ9.  In which process, a local variable has the same name as one of the instance variables?",
                    "\nQ10. Which package contains the Random class?",
                    
            };

    String[] option1 = {"Dynamic", "JVM", "char ch = '\utea';", "Object", "ABH8097","0", "javap tool", "for ( int i = 99; i >= 0; i / 9 )", "Serialization", "java.util package",};
    String[] option2 = {"Architecture Neutral", "JRE", "char ca = 'tea';", "Animation/movie file", "L990023","Not a Number", "javaw command", "for ( int i = 7; i <= 77; i += 7 )", "Variable Shadowing", "java.lang package",};
    String[] option3 = {"Use of pointers", "JDK", "char cr = \u0223;", "long", "904423","Infinity", "Javadoc tool", "for ( int i = 20; i >= 2; - -i )", "Abstraction", "java.awt package",};
    String[] option4 = {"Object-oriented", "JDB", char cc = '\itea';", "void", "0xnf029L", "Run time exception", "javah command", "for ( int i = 2; i <= 20; i = 2* i )", "Multi-threading", "java.io package",};
    
    int[] answers = {c, d, a, b, d, c, c, a, b, a};

    public void initGame() {
        for (int i=0;i<10;i++) {
            questions[i]=new Question();
        }

        for(int i = 0; i<10; i++) {
            questions[i].question=questionsData[i];
            questions[i].option1=option1[i];
            questions[i].option2=option2[i];
            questions[i].option3=option3[i];
            questions[i].option4=option4[i];
            questions[i].correctAnswer=answers[i];
        }
    }

    public void play() {
        player.getDetails();
        for(int i=0;i<10;i++) {
            boolean status=questions[i].askQuestion();
            if(status==true) {
                System.out.println("Your chosen answer is correct");
                player.score+=5;
            }
            else {
                System.out.println("Bad luck! Incorrect answer");
                player.score-=3;
            }
        }
        System.out.println("\n" + player.name + " score is " + player.score");
    }
}
