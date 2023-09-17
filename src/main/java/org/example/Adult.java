package org.example;

public class Adult {

    public static String age(int n) {
        if (n < 18) {
            return "You are still a kid!";
        } else {
            return "You are already adult!";
        }
    }
}
