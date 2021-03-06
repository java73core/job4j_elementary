package ru.job4j.array;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Defragment {
    public static String[] compress(String[] array) {
        String[] tempArray = new String[array.length];
        int pos = 0;
        for (int index = 0; index < array.length; index++) {
                if (array[index] != null) {
                    tempArray[pos] = array[index];
                    pos++;
                }
             System.out.print(array[index] + " ");
        }
        return tempArray;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}