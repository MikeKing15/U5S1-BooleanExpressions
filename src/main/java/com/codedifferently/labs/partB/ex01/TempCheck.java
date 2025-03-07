package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class TempCheck {

    public static String bool() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 100: ");
        int temp = scanner.nextInt();

        String response;
        if (temp <= 45) {
            response = "It's cold - putting on a coat!";
        } else if (temp >= 46 && temp <= 65) {
            response = "It's not bad out - a hoodie will do just fine!";
        } else {
            response = "It's hot - a T shirt will be perfect.";
        }

        scanner.close();
        return response;
    }

    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);
    }
}
