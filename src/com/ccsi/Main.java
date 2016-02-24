package com.ccsi;

public class Main {

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        int counter = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        boolean result = check (a, b, c, d);
                        if (result) {
                            System.out.printf("%d%d%d%d\n", a, b, c, d);
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.printf("There are %d numbers\n", counter);
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
    public static boolean check (int a, int b, int c, int d) {
        return (10 * a + b < 10 * b + c) && (10 * b + c < 10 * c + d) &&
         (10 * a + b + 10 * c + d == 2 * (10 * b + c));
    }
}
