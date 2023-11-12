package ru.itmo.java.basics.lab5;

public class MainEx3 {
    public static void main(String[] args) {
        String text = "привет бяка";
        String censorship = "[вырезано цензурой]";
        String badWord = "бяка";
        replace(text, badWord, censorship);
    }

    public static void replace(String text, String badWord, String censorship) {
        String replace = text.replace(badWord, censorship);
        System.out.println(replace);
    }
}
