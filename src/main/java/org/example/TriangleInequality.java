package org.example;

public class TriangleInequality {

    public static String createTriangle (double a, double b, double c) {
        if (a < b + c  && b < a + c && c < a + b) {
            double permt = a + b + c;
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b)
                    * (s - c));
            return "Perimeter: " + permt + " Area: " + area;
        } else {
            return "You cant create triangle! Check length of your sides, please.";
        }
    }
}
