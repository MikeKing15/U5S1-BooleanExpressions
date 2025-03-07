package com.codedifferently.labs.partC;

public class AlgoChallenge {

    /* Problem 1
    Checks if the given phrase starts with "mix" or any single character followed by "ix".
    */
    public static Boolean startWithIx(String phrase) {
        if (phrase.length() < 3) {
            return false;
        }
        return phrase.substring(1, 3).equals("ix");
    }

    /* Problem 2
    Evaluates which number is closer to 10, or returns 0 if both are equidistant.
    */
    public static Integer near10(int one, int two) {
        int distOne = Math.abs(one - 10);
        int distTwo = Math.abs(two - 10);

        if (distOne < distTwo) {
            return one;
        } else if (distTwo < distOne) {
            return two;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases for startWithIx
        System.out.println(startWithIx("mix snacks")); // true
        System.out.println(startWithIx("pix snacks")); // true
        System.out.println(startWithIx("piz snacks")); // false

        // Test cases for near10
        System.out.println(near10(8, 13)); // 8
        System.out.println(near10(13, 8)); // 8
        System.out.println(near10(13, 7)); // 0
    }
}
