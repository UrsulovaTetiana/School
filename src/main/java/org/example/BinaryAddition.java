package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryAddition {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void addBinaryNumbers () throws IOException {

        System.out.println("How many digits have binary numbers maximum?");
        int length = Integer.parseInt(br.readLine());
        System.out.println("Enter a first number digit by digit from right side");
        StringBuilder firstNumber = new StringBuilder();
        for (int i = 0; i < length; i++) {
            String binaryDigit = br.readLine();
            if(Integer.parseInt(binaryDigit) == 0 || Integer.parseInt(binaryDigit) == 1) {
                firstNumber.append(binaryDigit);
                reverseString(String.valueOf(firstNumber));
            } else {
                System.out.println("Invalid number! Please enter 1 or 0.");
                addBinaryNumbers();
            }
        }
        System.out.println();

    }

    public static String reverseString (String a) {
        StringBuilder reversed = new StringBuilder();
        for (int i = a.length(); i > 0; i--) {
            reversed.append(a.charAt(i -1));
        }
        return reversed.toString();
    }

}
