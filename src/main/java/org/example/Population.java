package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Population {

    public static void calculatePopulation () {

        Scanner scanner = new Scanner(System.in);

        double initialPopulation = 0;
        double annualIncrease = 0;
        int duration = 0;
        int decimalPlace = 0;

        System.out.println("Please enter the current population size in billions:");
        initialPopulation = scanner.nextDouble();
        System.out.println("Please enter annual increase in percent:");
        annualIncrease = scanner.nextDouble();
        System.out.println("Please enter the duration of the forecast:");
        duration = scanner.nextInt();
        System.out.println("Please enter the number of decimal places to be displayed:");
        decimalPlace = scanner.nextInt();

        System.out.println("Year " + "Initial Population " + "Annual Increase " + "End-population" + "\n");

        double population = initialPopulation;
        DecimalFormat df = new DecimalFormat();

        switch (decimalPlace) {
            case 1:
                df.applyLocalizedPattern("#,0");
                break;
            case 2:
                df.applyLocalizedPattern("#,00");
                break;
            case 3:
                df.applyLocalizedPattern("#,000");
                break;

        }

        for (int i = 1; i <= duration; i ++ ) {
            double increase = population/100 * annualIncrease;
            population = population + increase;
            double growthPercentage = ((population - initialPopulation) / initialPopulation) * 100;

            if (growthPercentage > 20) {
                System.out.println(i + " \t\t" + df.format(population - increase) + "\t\t" + df.format(increase) + "\t\t" + df.format(population) + "*");

            } else {
                System.out.println(i + " \t\t" + df.format(population - increase) + "\t\t" + df.format(increase) + "\t\t" + df.format(population));

            }
        }



    }
}
