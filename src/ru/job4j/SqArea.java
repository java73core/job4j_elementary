package ru.job4j;

public class SqArea {
    public static double square(int p, int k) {

        return (k*(p/(2*(k+1)))*(p/(2 * (k+1))))*(p/(2*(k+1)));

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}