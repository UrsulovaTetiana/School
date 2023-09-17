package org.example;

public class Order {

    public static String calcOrder (int screw, int nut, int washer) {
        int summ = 0;
        if ( screw == nut ) {
            summ = (screw * 2) + nut + washer;
            return "The price of your order: " + summ + " Euro";
        } else {
            summ = (screw * 2) + nut + washer;
            return "The price of your order: " + summ + " Euro, " +
                    "but check your order (must be same number of screws and nuts).";
        }
    }
}
