package ru.itmo.java.basics.lab4.part1;

public class MainEx2 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            }
        }
        System.out.println("\n");

        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
        System.out.println("\n");

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
    }
}
