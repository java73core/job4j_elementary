package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        String worD = new String(word);
        String posT = new String(post);
        return worD.endsWith(posT) ? true : false;
    }
}