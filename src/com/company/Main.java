package com.company;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        boolean minus = false;
        double[] counts = {1.6, 4.1, -2.2, 12.1, 43.6, -11.8, 2.1, -5.7, -6.1, 34.7, 1.8, 0, 55.8, 32.9, 7.8};

        for (double task : counts) {
            if (task < 0) {
                minus = true;
                continue;
            }
            if (minus) {
                sum = (sum + task)/8;
            }
        }
        System.out.println("Средне арифметическое число "+sum);
    }
}
