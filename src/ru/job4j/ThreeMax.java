package ru.job4j;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = second;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}
