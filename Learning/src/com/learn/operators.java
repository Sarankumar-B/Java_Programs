package com.learn;

public class operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println();

        // Relational operators
        System.out.println("Relational Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));
        System.out.println(); 
        
        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT for x: " + (!x));
        System.out.println("Logical NOT for y: " + (!y));
        System.out.println();

        // Assignment operators 
        int c = 20;
        System.out.println("Assignment Operators:");
        c += 10; // Equivalent to c = c + 10
        System.out.println("Add and assign: " + c);
        c -= 5;  // Equivalent to c = c - 5
        System.out.println("Subtract and assign: " + c);
        c *= 2;  // Equivalent to c = c * 2
        System.out.println("Multiply and assign: " + c);
        c /= 4;  // Equivalent to c = c / 4
        System.out.println("Divide and assign: " + c);
        c %= 3;  // Equivalent to c = c % 3
        System.out.println("Modulus and assign: " + c);
        System.out.println();

    }
}
