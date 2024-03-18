package com.learn;

public class methods {

    // Method to calculate the sum of two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to calculate the product of two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) { 
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
 
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + multiply(num1, num2));

        int numberToCheck = 7;
        if (isEven(numberToCheck)) {
            System.out.println(numberToCheck + " is even.");
        } else {
            System.out.println(numberToCheck + " is odd.");
        }
    }
}
