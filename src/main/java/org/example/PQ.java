package org.example;

import java.util.Arrays;

public class PQ {

    public static void main (String[] arg) {
        System.out.println(Arrays.toString(calculatePQ(6, -7)));
    }

    public static double[] calculatePQ(double p, double q) {

        double[] result = new double[0];

        double d = Math.pow(p, 2) / 4 - q;

        if (d > 0) {
            result = new double[2];
            result[0] = -p / 2 + Math.sqrt(d);
            result[1] = -p / 2 - Math.sqrt(d);
        } else if (d == 0) {
            result = new double[1];
            result[0] = -p / 2;
        }

        return result;
    }
}
