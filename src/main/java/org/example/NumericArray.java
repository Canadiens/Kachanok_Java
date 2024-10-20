package org.example;

import java.util.Scanner;

public class NumericArray {
    public void setArrayDates(Scanner scanner) {

        int size = 0;

        while (size <= 0) {
            System.out.print("Enter the number of elements for the array : ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }

        int[] inputArray = new int[size];
        System.out.println("Enter " + size + " numbers for the array:");
        for (int i = 0; i < size; i++) {
            while (true) {
                if (scanner.hasNextInt()) {
                    inputArray[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                }
            }
        }

        System.out.println("Elements that are multiples of 3:");
        for (int num : inputArray) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
