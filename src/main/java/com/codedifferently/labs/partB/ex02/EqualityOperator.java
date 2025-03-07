package com.codedifferently.labs.partB.ex02;

public class EqualityOperator {
    public static String numEquality(){
        int num1 = 4;
        int num2 = 5;

        String response = "Are " + num1 + " and " + num1 + " equal? " + (num1 == num1) + "\n";
        response += "Are " + num1 + " and " + num2 + " equal? " + (num1 == num2);

        return response;
    }

    public static void main(String args[]) {
        String equalityOutput = numEquality();
        System.out.println(equalityOutput);
    }
}
