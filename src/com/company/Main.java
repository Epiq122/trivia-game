package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Trivia Game created by Rob!");

        int score = 0;


        System.out.println("Question 1");
        System.out.println("\n1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\tc) Brazil\td) Italy\n");
        String question1 = scan.nextLine();

        if (question1.equals("c")) {
            score += 5;
        }
        System.out.println("Question 2");
        System.out.println("\n1. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\tc) Mercury\td) Mars\n");
        String question2 = scan.nextLine();

        if (question2.equals("a")) {
            score += 5;
        }
        System.out.println("Question 3");
        System.out.println("\n1. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\tc) B\td) AB-Negative\n");
        String question3 = scan.nextLine();

        if (question3.equals("d")) {
            score += 5;
        }
        System.out.println("Question 4");
        System.out.println("\n1. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\tc) Draco Malfoy");
        String question4 = scan.nextLine();

        if (question4.equals("a") || question4.equals("b")) {
            score += 5;
        }

        if (score == 20) {
            System.out.println("Your final score is 20/20");
            System.out.println("Wow you know your stuff!");
        } else if (score == 5) {
            System.out.println("Your final score is 5/20");
            System.out.println("Not Bad but still kinda bad?");
        } else if (score == 0) {
            System.out.println("Your final score is 0/20");
            System.out.println("This isnt good.");
        }
    }
}
