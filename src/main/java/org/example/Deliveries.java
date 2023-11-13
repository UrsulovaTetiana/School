package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Deliveries {
    public static void main(String[] args) {
        calculateSum(userInput(),userInput());
    }


    public static int[][] userInput () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please how much items do u have?");
        int rowsNumber = scanner.nextInt();
        System.out.println("Enter please how many clients do u have!");
        int columnsNumber = scanner.nextInt();
        int [][] prices = new int[rowsNumber][columnsNumber];
        for (int i = 0; i < rowsNumber; i++) {
            System.out.println("Enter prices of " + (i + 1) + " item:" );
            for (int j = 0; j < columnsNumber; j++) {
                System.out.println( (j + 1) + " client");
                int price = scanner.nextInt();
                prices[i][j] = price;
            }
        }
        System.out.println(Arrays.deepToString(prices));
        return prices;


    }

    public static void calculateSum(int[][] firstMonth, int[][] secondMonth) {
        int[][] result = new int[firstMonth.length][firstMonth[0].length];
        for (int i = 0; i < firstMonth.length; i++) {
            for (int j = 0; j < firstMonth[0].length; j++) {
                result[i][j] = firstMonth[i][j] + secondMonth[i][j];
            }
        } displayResult(result);
    }
    public static void displayResult(int[][]sum) {
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }



}
