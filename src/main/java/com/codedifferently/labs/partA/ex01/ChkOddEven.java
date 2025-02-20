package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven(int num) {
        if (num % 2 == 0) {
            return "The num is even " + num;
        } else {
            return "The num is odd " + num;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number (1-10): ");
        int num = in.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
        } else {
            System.out.println(oddEven(num));
        }

        in.close();
    }
}
