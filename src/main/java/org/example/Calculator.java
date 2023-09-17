package org.example;

public class Calculator {
    public static String calculate (double a, char x, double b) {
        if (x == '+') {
            double sum = a + b;
            return a + "+" + b + "=" + sum;
        } else if (x == '-') {
            double sub = a - b;
            return a + "-" + b + "=" + sub;
        } else if (x == '/') {
            double div = a / b;
            return a + "/" + b + "=" + div;
        } else if (x == '*') {
            double mul = a * b;
            return a + "*" + b + "=" + mul;
        } else {
            double result = Math.pow(a,b);
            return a + "^" + b + "=" + result;
        }
    }

}
