package ru.job4j;

public class ArrayDefinition {
    public static void main(String[] args) {
       String[] str = new String[4];
       str[0] = "Ivan Ivanov";
       str[1] = "Petr Petrov";
       str[2] = "Sidor Sidorov";
       str[3] = "Igor Iluhin";
       for (int i = 0; i < str.length; i++) {
           System.out.println(str[i]);
       }
    }
}
