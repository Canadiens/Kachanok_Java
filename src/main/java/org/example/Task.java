package org.example;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            PrintHello hello = new PrintHello();
            NameMatches name = new NameMatches();
            NumericArray num = new NumericArray();
            hello.setNumber(scanner);
            name.setName(scanner);
            num.setArrayDates(scanner);
        }
    }
}
