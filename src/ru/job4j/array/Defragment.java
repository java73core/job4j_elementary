package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (int i = point+1; i < array.length ; i++) {
                    if (array[i] != null) {
                        int dest = i;
                        swap(array, point, dest);
                        break;
                    }
                }
                }
            /* переместить первую не null ячейку. Нужен цикл. */
            System.out.print(array[index] + " ");
        }
        return array;
    }
    public static String[] swap(String[] array, int point, int dest) {
        String tmp = array[point];
        array[point] = array[dest];
        array[dest] = tmp;
        return array;
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