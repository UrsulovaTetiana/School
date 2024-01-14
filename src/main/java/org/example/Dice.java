package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Dice {
    public static void main(String[] a) {
    }

    public static int[][] userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please how many dice experiments u wanna do? ");
        int rows = scanner.nextInt();
        System.out.println("How many dice combination pro experiment u wanna do?");
        int columns = scanner.nextInt();
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter dice combinations of " + (i + 1) + " experiment");
            for (int j = 0; j < columns; j++) {
                int input = scanner.nextInt();
                result[i][j] = input;
            }

        }
        return result;
    }

    public static void evaluateEachExperiment(int[][] userInput) {
        int[] expectedValues = new int[userInput.length];
        for (int i = 0; i < userInput.length; i++) {
            int sum = 0;
            int standardDeviation = 0;
            for (int j = 0; j < userInput[0].length; j++) {
                sum += userInput[i][j];
            }
            expectedValues[i] = sum/userInput[0].length;
        }
        System.out.println("Expected values: " + Arrays.toString(expectedValues));

    }

    public static void getDeviation(int[][] input) {

    }

    public static void displayResult(int[][]sum) {
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
