package com.codedifferently.labs.partB.ex04;

import java.util.Scanner;

public class IfElse {

    public static String equalToSeven(int number){
        String response = "";

        if (number == 7) {
            response = "That's lucky!";
        } else {
            response = "That's unlucky!";
        }

        return response;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String luckyOutput = equalToSeven(number);
        System.out.println(luckyOutput);

        scanner.close();
    }
}
