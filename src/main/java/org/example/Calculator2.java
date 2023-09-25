package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator2 {


    public static void writeMenu () {
        System.out.println("The following calculation operations are available for selection:\n " +
                "[+] for addition\n" +
                "[-] for subtraction\n" +
                "[*] for multiplication\n" +
                "[/] for division\n" +
                "[e] for exponent\n" +
                "[s] for square root\n" +
                "Please choose operation:");
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void calculate () throws IOException{

        boolean cont = true;
        do {
            writeMenu();
            String operation = br.readLine();
            switch (operation) {
                case "+":
                    addNumbers();
                    break;
                case "-":
                    subtractNumbers();
                    break;
                case "*":
                    multiplyNumbers();
                    break;
                case "/":
                    divideNumbers();
                    break;
                case "e":
                    exponentNumbers();
                    break;
                case "s":
                    squareNumber();
                    break;
            }
        }
        while (cont);
        System.out.println("If you want to repeat, press [j]");
        String repeat = br.readLine();
        if (repeat.equals("j") || repeat.equals("J")) {

        }
    }

    public static void addNumbers () throws IOException {
        System.out.println("Please write first number:");
        double num1 = Double.parseDouble(br.readLine());
        System.out.println("Please write second number:");
        double num2 = br.read();
        double result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result );

    }

    public static void subtractNumbers () throws IOException {
        System.out.println("Please write first number:");
        double num1 = Double.parseDouble(br.readLine());
        System.out.println("Please write second number:");
        double num2 = br.read();
        double result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result );

    }

    public static void multiplyNumbers () throws IOException {
        System.out.println("Please write first number:");
        double num1 = Double.parseDouble(br.readLine());
        System.out.println("Please write second number:");
        double num2 = br.read();
        double result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result );

    }

    public static void divideNumbers () throws IOException {
        System.out.println("Please write first number:");
        double num1 = Double.parseDouble(br.readLine());
        System.out.println("Please write second number:");
        double num2 = br.read();
        double result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result );

    }

    public static void exponentNumbers () throws IOException {
        System.out.println("Please write base number:");
        double num1 = Double.parseDouble(br.readLine());
        System.out.println("Please write exponent:");
        double num2 = br.read();
        System.out.println(num1 + "to power" + num2 + "=" + Math.pow(num1,num2) );

    }

    public static void squareNumber () throws IOException {
        System.out.println("Please enter a number:");
        double num = br.read();
        System.out.println("Square of" + num + "is:" + Math.sqrt(num));
    }






}
