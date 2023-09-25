package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;

public class Temperature {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void temperature() throws IOException, ParseException {
        double[] temperatures = new double[7];
        double sum = 0;
        double minValue = 0;
        double maxValue = 0;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        decimalFormatSymbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("#.##", decimalFormatSymbols);


        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Please enter temperature on day " + (i + 1) + ":\n");
            String userInput = br.readLine();
            Object parsed = df.parseObject(userInput);
            double temp = Double.parseDouble(parsed.toString());
            temperatures[i] = temp;
            sum += temp;
        }
        double roundOff = Math.round((sum/7) * 100.0) / 100.0;

        for (double t : temperatures) {
            if(t > maxValue) {
                maxValue = t;
            } else {
                minValue = t;
            }
        }


        System.out.println(Arrays.toString(temperatures) + "\nAverage = " + roundOff + "\nMax temperature: " + maxValue +
                "\nMin temperature: " + minValue +
                "\nSpan: " + (maxValue - minValue) +
                "\nMax difference: " + maxDifference(temperatures)) ;
    }

    public static double maxDifference (double[] temp) {
        double result = 0;
        for (int i = 1; i < temp.length; i++) {
                double difference = Math.abs(temp[i] - temp[i - 1]);
               if(difference > result) {
                   result = difference;
            }
        }
        return result;
    }

}
