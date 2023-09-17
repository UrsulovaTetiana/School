package org.example;

public class DriverLicense {

    public static String allowDrive (int age) {
        if (age < 14) {
            return "You are allowed to drive a bobby car or a bicycle";
        } else if (age == 14 || age == 15) {
            return "You are already allowed to drive 50s";
        } else if (age == 16 || age == 17) {
            return "You may already drive 125s, but not a car yet.";
        } else {
            return "You are allowed to drive a car";
        }
    }
}
