package com.learn;
import java.util.Scanner;

public class conditional_statemts {
    public static void main(String[] args) {
     
    	int age = 10;
    	System.out.println("Your Age is: "+age);
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Nested if-else
        int number = 78;
        System.out.println("You enter the number: "+number);
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch statement
        int day = 6;
        System.out.println("Your entered day number: "+day);
        System.out.print("Day:");
        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid day number.");
        }

 
    }
}
