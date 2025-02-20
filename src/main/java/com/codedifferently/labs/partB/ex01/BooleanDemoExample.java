package com.codedifferently.labs.partB.ex01;

public class BooleanDemoExample {

    public static String bool() {
        String response = "";

        boolean passed = true;
        boolean largeVenue = false;
        boolean goodGrade = passed;

        response += passed + "\n";
        response += largeVenue + "\n";
        response += goodGrade;

        return response;
    }

    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);
    }
}
