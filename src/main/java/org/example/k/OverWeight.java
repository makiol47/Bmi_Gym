package org.example.k;

import java.util.Scanner;


public class OverWeight {
    LoseWeight loseWeight = new LoseWeight();
    LoseWeight loseWeight2 = new LoseWeight();
    LoseWeight loseWeight3 = new LoseWeight();
    Scanner scanner = new Scanner(System.in);
    public void Over() {
        System.out.println("I would like to recommend u to lose weight with gym-plan ");
        System.out.println("How many days u would like to train 3-5 ");
        int answer = scanner.nextInt();
        if (answer == 3){
            System.out.println("U chose 3 days training per week\n" +
                    "Would u like to train at Monday,Wednesday and friday choose 1,\n" +
                    "to train whenever u want choose 2.");
            while (true){
                int answer1 = scanner.nextInt();
                if (answer1 == 1){
                    System.out.println("You picked 1st choice");
                    loseWeight.loseWeight();
                    break;

                } else if (answer1 == 2){
                    System.out.println("You picked 2nd choice");
                    loseWeight.loseWeight2();
                    break;

                } else {
                    System.out.println("Wrong value ");

                }

            }

        } else if (answer == 4) {
            System.out.println("U picked 4 Days ");
            while (true){
                int answer2 = scanner.nextInt();
                if (answer2 == 1){
                    System.out.println("You picked 1st choice");
                    loseWeight.loseWeight2();
                    break;

                } else if (answer2 == 2){
                    System.out.println("You picked 2nd choice");
                    loseWeight.loseWeight2();
                    break;

                } else {
                    System.out.println("Wrong value ");

                }

        } } else if (answer == 5) {
            System.out.println("U picked 5 Days ");
            while (true) {
                int answer3 = scanner.nextInt();
                if (answer3 == 1) {
                    System.out.println("You picked 1st choice");
                    loseWeight.loseWeight3();
                    break;

                } else if (answer3 == 2) {
                    System.out.println("You picked 2nd choice");
                    loseWeight.loseWeight3();
                    break;

                } else {
                    System.out.println("Wrong value ");

                }

            }
        } else {
            System.out.println("Wrong avlue ");
            Over();
        }


    }
}
