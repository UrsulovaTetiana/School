package org.example;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class SavingsContract {

    public static void countSavContract (){

        Scanner scanner = new Scanner(System.in);

        double startingCapital = 0;
        double interestRate = 0;
        int year = 0;
        String playAgain = "";

        System.out.println("Please enter starting capital: ");
        startingCapital = scanner.nextDouble();
        System.out.println("Please enter interest rate: ");
        interestRate = scanner.nextDouble();
        System.out.println("Please enter a term: ");
        year = scanner.nextInt();

        System.out.println("Jahr " + "Starting Capital " + "Interest Amount " + "Year-end Amount" + "\n");

        double capital = startingCapital;
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 1; i <= year; i ++ ) {
            double interestAmount = capital / 100 * interestRate;
            capital = capital + interestAmount;
            System.out.println(i + "\t\t " + df.format(capital - interestAmount) + "\t\t " + df.format(interestAmount) + "\t\t " + df.format(capital));
        }

        System.out.println("Do you want to calculate another population forecast?");
        playAgain = scanner.next();
        if (playAgain.equals("j") || playAgain.equals("J")){
            countSavContract();
        }

    }
}
