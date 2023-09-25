package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayTasks {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void vote () throws IOException {
        System.out.println("How many candidates are still in the race?");
        int len = Integer.parseInt(br.readLine());
        System.out.println("Enter the percentage distribution of voting:");
        double [] percentages = new double[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Candidate " + (i + 1) + ":");
            double percent = Double.parseDouble(br.readLine());
            percentages[i] = percent;
        }
        for(double p : percentages) {
            System.out.println(repeatString(p,"*") + p + "%\n");
        }
    }

    public static String repeatString(double n, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }


    public static void getMaxNumber () throws IOException {
        System.out.println("Please enter length of yor Array:");
        int length = Integer.parseInt(br.readLine());
        double [] numbers = new double[length];
        double maxNumber = 0;
        double maxNumber2 = 0;
        for (int i = 0; i < length; i ++) {
            System.out.println((i + 1) + " number:");
            double num = Double.parseDouble(br.readLine());
            numbers[i] = num;
        }
        for (double number : numbers) {
            if (number > maxNumber) {
                maxNumber2 = maxNumber;
                maxNumber = number;
            } else if (number > maxNumber2 && number < maxNumber) {
                maxNumber2 = number;
            }
        }
        System.out.println("MaxNumber = " + maxNumber + "\nMaxNumber2 = " + maxNumber2);
    }


    public static void sumEvenNumbers () throws IOException {
        System.out.println("Please enter length of yor Array:");
        int length = Integer.parseInt(br.readLine());
        double [] numbers = new double[length];
        int countEven = 0;
        int countOdd = 0;
        double summ = 0;
        double summ2 = 0;

//        List<Double> even = new ArrayList<>();
//        List<Double> odd = new ArrayList<>();
        for (int i = 0; i < length; i ++) {
            System.out.println((i + 1) + " number:");
            double num = Double.parseDouble(br.readLine());
            numbers[i] = num;
        }
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] % 2 == 0) {
                //     even.add(numbers[i]);
                summ += numbers[i];
                countEven ++;
            } else {
                summ2 += numbers[i];
                //     odd.add(numbers[i]);
                countOdd++;
            }
        }
//        System.out.println("Even numbers: "+ countEven + "\nOdd numbers: " + countOdd +"\nSum1: " + even.stream()
//                .mapToDouble(a -> a).sum() + "\nSum2: " + odd.stream().mapToDouble(a -> a).sum());
        System.out.println("Even numbers: "+ countEven + "\nOdd numbers: " + countOdd +"\nSum1: " + summ + "\nSum2: " + summ2);

    }

    public static void doubleArray() throws IOException {
        System.out.println("Please enter length of yor Array:");
        int length = Integer.parseInt(br.readLine());
        double [] numbers = new double[length];
        double [] numbersDouble;
        for (int i = 0; i < length; i ++) {
            System.out.println((i + 1) + " number:");
            double num = Double.parseDouble(br.readLine());
            numbers[i] = num;
        }
        numbersDouble = numbers.clone();
        for (int x = 0; x < numbersDouble.length; x ++) {
            numbersDouble[x] = numbersDouble[x] * 2;
        }

        System.out.println("Array:\n" + Arrays.toString(numbers) + "\nDouble Array\n" + Arrays.toString(numbersDouble));
    }




    public static void addInArray() throws IOException {
        double[] numbers = new double[5];
        System.out.println("Please enter a five decimal numbers:\n" +
                "1 number:\n");
        double num1 = Double.parseDouble(br.readLine());
        System.out.println("2 number:\n");
        double num2 = Double.parseDouble(br.readLine());
        System.out.println("3 number:\n");
        double num3 = Double.parseDouble(br.readLine());
        System.out.println("4 number:");
        double num4 = Double.parseDouble(br.readLine());
        System.out.println("5 number");
        double num5 = Double.parseDouble(br.readLine());
        System.out.println("Please enter a search number:");
        double searchNum = Double.parseDouble(br.readLine());
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        numbers[3] = num4;
        numbers[4] = num5;
        for (Double number : numbers) {
            if (number == searchNum) {
                System.out.println("Hit");
            } else {
                System.out.println("Bust");
            }
        }


    }
}





