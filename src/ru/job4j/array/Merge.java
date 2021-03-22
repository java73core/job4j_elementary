package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for(int i = 0; i < left.length; i++){
            rsl[i] = left[i];
        }
        for(int i = left.length, j = 0; i < rsl.length; i++, j++){
            rsl[i] = right[j];
        }
        Arrays.sort(rsl);
        return rsl;
    }
}