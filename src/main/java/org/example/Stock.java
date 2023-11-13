package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stock {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void calculateItems () throws IOException {

        System.out.println("How much items do you have in stock?");
        int length = Integer.parseInt(br.readLine());
        String[] items = new String[length];
        System.out.println("Enter item descriptions:");
        for (int i = 0; i < length; i++) {
            System.out.println("Item " + (i + 1));
            String userInput = br.readLine();
            items[i] = userInput;
        }
        System.out.println("Enter a price of each item:");
        double [] prices = new double[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Price of " + items[i]);
            prices[i] = Double.parseDouble(br.readLine());
        }
        System.out.println("Enter a quantity of items:");
        int [] quantity = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Quantity of " + items[i]);
            quantity[i] = Integer.parseInt(br.readLine());
        }
        double [] result = new double[length];
        double sum = 0;
        int sumItems = 0;
        for (int i = 0; i < length; i++) {
            result[i] = prices[i] * quantity[i];
            sum += result[i];
            sumItems += quantity[i];
        }

        System.out.println("In your stock are " + sumItems + " items; items worth " + sum + "$");


    }
}
