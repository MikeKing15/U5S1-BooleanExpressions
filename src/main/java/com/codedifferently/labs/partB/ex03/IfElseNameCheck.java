package com.codedifferently.labs.partB.ex03;

import java.util.Scanner;

public class IfElseNameCheck {
    public static String nameCheck(String name){
        String response = "";

        if (name.equalsIgnoreCase("Elvis")) {
            response = "You are the king of rock and roll";
        } else {
            response = "You are not the king";
        }

        return response;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String responseToName  = nameCheck(name);
        System.out.println(responseToName);

        scanner.close();
    }
}
