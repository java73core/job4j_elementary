package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minI = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int tmp = array[i];
                array[i] = array[minI];
                array[minI] = tmp;
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}