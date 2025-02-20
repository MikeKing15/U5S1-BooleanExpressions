package com.codedifferently.labs.partA.ex02;

public class AgeCheck {
    public static String age(int myAge) {
        if (myAge >= 16) {
            return "I'm old enough to have a driver's license!";
        } else {
            return "I'm not old enough yet... :*(";
        }
    }

    public static void main(String[] args) {
        int myAge = 12;
        System.out.println(age(myAge));
    }
}
