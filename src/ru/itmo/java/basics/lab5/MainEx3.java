package ru.itmo.java.basics.lab5;

public class MainEx3 {
    public static void main(String[] args) {
        String text = "привет бяка";
        replace(text);
    }

    public static void replace(String text) {
        String replace = text.replace("бяка", "[вырезано цензурой]");
        System.out.println(replace);
    }
}
