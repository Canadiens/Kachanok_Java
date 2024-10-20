package org.example;

import java.util.Scanner;

public class NameMatches {
    public void setName(Scanner scanner) {
        System.out.print("Enter a name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("John")) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("There is no such name");
        }
    }
}
