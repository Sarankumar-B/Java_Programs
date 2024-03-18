package com.learn;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Declaration and initialization of an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modifying an element of the array
        numbers[2] = 35;
        System.out.println("\nAfter modifying an element:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }


        // Finding the maximum element
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);
        
     // Finding the minimum element
        int min= numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
