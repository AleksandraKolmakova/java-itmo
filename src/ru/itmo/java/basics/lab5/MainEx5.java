package ru.itmo.java.basics.lab5;

public class MainEx5 {
    public static void main(String[] args) {
        String text = "This is a test string";
        reverse(text);
    }

    public static void reverse(String text) {
        for (String word : text.split(" ")) {
            System.out.print(new StringBuilder(word).reverse().toString());
            System.out.print(" ");
        }
    }
}
