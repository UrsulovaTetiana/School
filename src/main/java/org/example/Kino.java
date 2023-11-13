package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kino {

    private static final String[][] hall = new String[10][20];

    public static void main(String[] args) {
        generateHall();
        reservePlace();
    }

    private static String[][] generateHall() {
        String freePlace = "O";
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = freePlace;
            }
        }
        return hall;
    }

    private static void showHall() {
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                System.out.print(hall[i][j]);
            }
            System.out.println();
        }
    }

    private static void reservePlace() {
        String reservedPlace = "X";
        Scanner scanner = new Scanner(System.in);
        showHall();
        System.out.println("Please choose your seat! Enter first a row number: ");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter please a seat number: ");
        int columnNumber = scanner.nextInt();
        if (!hall[rowNumber - 1][columnNumber - 1].equals(reservedPlace)) {
            hall[rowNumber - 1][columnNumber - 1] = reservedPlace;
            System.out.println("Your reservation: " + rowNumber + " row, seat - " + columnNumber);
            showHall();
            System.out.println("If you want to reserve another seat, please press 'R',\n" +
                    "if you want to cancel your reservation, please press 'C',\n" +
                    "if you want to finish, please press 'F'");
            String result = scanner.next();
            switch (result) {
                case "R":
                    reservePlace();
                    break;
                case "C":
                    cancelSeat();
                    break;
                case "F":
                    System.out.println("You finished a program!");
                default:
                    System.out.println("Something went wrong! Try again!");
                    break;
            }
        } else {
            System.out.println("This place already reserved! Choose another place please:");
            reservePlace();
            showHall();

        }
    }



    private static void cancelSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your seat to cancel! Enter first a row number: ");
        int rowNumberToCancel = scanner.nextInt();
        System.out.println("Enter please a seat number: ");
        int columnNumberToCancel = scanner.nextInt();
        hall[rowNumberToCancel - 1][columnNumberToCancel - 1] = "O";

    }


}


