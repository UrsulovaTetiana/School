package org.example;

import java.lang.reflect.Array;

public class ReportCard {

    public static void makeReport (int [] arr) {
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
          count += arr[i];
        }
        System.out.printf("Your average grades:" + count / arr.length);

    }
}
