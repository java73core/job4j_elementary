package ru.job4j;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if (Math.abs(n) == 0) {
            result = 1;
        } else {
        result = 1;
        for (int i = 1; i <= Math.abs(n); i++) {
            result *= i;
        }
        }
        return result;
    }
}
