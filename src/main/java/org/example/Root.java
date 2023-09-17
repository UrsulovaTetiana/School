package org.example;

public class Root {

    private final static String STAR = "*";

    public static void toRoot (int a, int b){
        for(int i = a; i <= b; i ++) {
           int  square = i * i;
            System.out.printf( " Square of " + i + " = " + square + "\n");
        }
    }

    public static void factorial (int a) {
        int fact = 1;
        for (int i = 1; i <= a; ++i ) {
           fact *= i;
        }
        System.out.printf("Factorial of " + a + "=" + fact);
    }

    public static void sumsOfSquares (int a) {
        int summ = 0;
        for (int i = 1; i <= a; i++) {
            int square = i * i;
            summ += square;
        }
        System.out.printf("Summ of squared numbers between 1 and " + a + " = " +summ);
    }

    public static void drawSquare (int a) {
        String square = "";
        for(int i = 0; i < a; i++) {
            String row = "";
            for (int x = 0; x < a; x++) {
                if (i == 0 || i == a - 1) {
                    row += STAR;
                } else {
                    row = getMiddleRow(a, x, row);
                }
            }
            square += row + "\n";
        }
        System.out.println(square);
    }

    private static String getMiddleRow(int a, int x, String row) {
        if(x == 0 || x == a - 1) {
            row += STAR;
        } else {
            row += " ";
        }
        return row;
    }


//    public static void drawSide (String x, int a) {
//        StringBuilder row = new StringBuilder();
//        for (int i = 1; i<=a; i ++) {
//            row.append(x);
//        }
//        System.out.printf(String.valueOf(row));
//    }
//
//    public static void drawEmpty (String x, int a) {
//        StringBuilder col = new StringBuilder();
//        for (int i = 1; i<= a - 2; i ++) {
//            col.append(" ");
//        }
//    }
}
