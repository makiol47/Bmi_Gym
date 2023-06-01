package org.example.k;
import org.example.k.Normal;

import java.util.Scanner;
public class Bmi {
    public void start(){
        Normal normal = new Normal();
        UnderWeight underWeight = new UnderWeight();
        OverWeight overWeight = new OverWeight();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, to check your bmi we need your weight and height. Please put them below.");

        System.out.println("What's your weight in kilograms ");
        double weight =(scanner.nextDouble());
        System.out.println("Your weight is " + weight + "kgs");

        System.out.println("What's your height in meters ");
        double height =(scanner.nextDouble());
        System.out.println("Your weight is " + height + "m");

        double bmi = weight/(height*height);
        System.out.println(bmi);

        if (bmi <= 18.5){
            System.out.println("You are underweight");
            underWeight.Under();
        } else if (bmi >18.5 && bmi <=25) {
            System.out.println("Normal weight ");
            normal.Norm();
        } else if (bmi > 25 && bmi <=35) {
            System.out.println("You are overweight");
            overWeight.Over();
        } else{
            System.out.println("Wrong values try again ");
            start();
        }

    }

}
