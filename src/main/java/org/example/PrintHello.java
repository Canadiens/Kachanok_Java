package org.example;

import java.util.Scanner;

public class PrintHello {
    public void setNumber(Scanner scanner) {

        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                validInput = true;
                if (number > 7) {
                    System.out.println("Hello");
                }
            } else {
                System.out.println("PLease enter a number.");
                scanner.next();
            }
        }
    }
}


