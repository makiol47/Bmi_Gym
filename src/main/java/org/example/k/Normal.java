package org.example.k;

import java.util.Scanner;

public class Normal {
    Scanner scanner = new Scanner(System.in);
    FirstDay firstDay = new FirstDay();
    SecondDay secondDay = new SecondDay();
    ThirdDay thirdDay = new ThirdDay();
    FourthDay fourthDay = new FourthDay();
    FifthDay fifthDay = new FifthDay();
    public void Norm(){
        System.out.println("Would u like to gain muscles with gym-plan? ");
        System.out.println("How many days would u like to train per week? (3-5)");
        int answer = scanner.nextInt();
        if (answer ==3){
            System.out.println("You chose 3 days per week, now choose the days u would like to train (1-4) ");
            System.out.println("Monday, wednesday and friday = pick 1 ");
            System.out.println("Tuesday, thursday and saturday = pick 2");
            System.out.println("Wednesday, friday and sunday = pick 3");
            System.out.println("I would like to go whenever i want to = pick 4");

            while (true){
                int answer1 = scanner.nextInt();
                if (answer1 == 1){
                    System.out.println("U picked 1st choice.\n");
                    System.out.println("MONDAY ");
                    firstDay.First();
                    System.out.println("WEDNESDAY ");
                    secondDay.Second();
                    System.out.println("FRIDAY ");
                    thirdDay.Third();

                    break;
                } else if (answer1 == 2){
                    System.out.println("U picked 2nd choice.\n");
                    System.out.println("TUESDAY ");
                    firstDay.First();
                    System.out.println("THURSDAY ");
                    secondDay.Second();
                    System.out.println("SATURDAY ");
                    thirdDay.Third();

                    break;

                } else if (answer1 == 3) {
                    System.out.println("U picked 3rd choice.\n");
                    System.out.println("WEDNESDAY ");
                    firstDay.First();
                    System.out.println("FRIDAY ");
                    secondDay.Second();
                    System.out.println("SUNDAY");
                    thirdDay.Third();
                    break;

                } else if (answer1 == 4) {
                    System.out.println("U picked 4th choice, good choice :D\n");
                    System.out.println("1ST DAY ");
                    firstDay.First();
                    System.out.println("2ND DAY ");
                    secondDay.Second();
                    System.out.println("3RD DAY ");
                    thirdDay.Third();

                    break;

                } else {
                    System.out.println("Wrong value choose between 1-4");

                }
            }

        } else if (answer == 4) {
            System.out.println("I train at Monday,Tuesday,Thursday and saturday, choose 1");
            System.out.println("I train whenever i want, choose 2");

            while (true) {
                int answer2 = scanner.nextInt();
                if (answer2 == 1) {
                    System.out.println("U picked 1st choice.\n");
                    System.out.println("MONDAY ");
                    firstDay.First();
                    System.out.println("TUESDAY ");
                    secondDay.Second();
                    System.out.println("THURSDAY ");
                    thirdDay.Third();
                    System.out.println("SATURDAY ");
                    fourthDay.Fourth();

                    break;
                }   else if (answer2 == 2) {
                    System.out.println("U picked 2nd choice.\n");
                    System.out.println("1ST DAY ");
                    firstDay.First();
                    System.out.println("2ND DAY ");
                    secondDay.Second();
                    System.out.println("3RD DAY ");
                    thirdDay.Third();
                    System.out.println("4TH DAY ");
                    fourthDay.Fourth();

                    break;

                } else {
                    System.out.println("Wrong value choose between 1-2");

                }
            }
            
        } else if (answer == 5) {
            System.out.println("I train at MONDAY, TUESDAY, WEDNESDAY, THURSDAY AND FRIDAY. ");
            System.out.println("I train whenever i want. ");
                while (true){
                    int answer3 = scanner.nextInt();
                    if (answer3 == 1){
                        System.out.println("U picked 1st choice.\n");
                        System.out.println("MONDAY ");
                        firstDay.First();
                        System.out.println("TUESDAY ");
                        secondDay.Second();
                        System.out.println("WEDNESDAY ");
                        thirdDay.Third();
                        System.out.println("THURSDAY ");
                        fourthDay.Fourth();
                        System.out.println("FRIDAY ");
                        fifthDay.Fifth();

                        break;
                    } else if (answer3 == 2) {
                        System.out.println("U picked 2nd choice.\n");
                        System.out.println("1ST DAY ");
                        firstDay.First();
                        System.out.println("2ND DAY ");
                        secondDay.Second();
                        System.out.println("3RD DAY ");
                        thirdDay.Third();
                        System.out.println("4TH DAY ");
                        fourthDay.Fourth();
                        System.out.println("5TH DAY ");
                        fifthDay.Fifth();

                        break;

                    } else {
                        System.out.println("Wrong value choose between 1-2");

                    }
            }

        } else {
            System.out.println("Wrong value. Try again\n");
            Norm();
        }

    }

    }

