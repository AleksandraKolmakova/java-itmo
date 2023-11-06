package ru.itmo.java.basics.lab4.part2;

import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] ints = new int[length];
        System.out.println("Введите числа массива: ");
        array(ints);
    }

    private static void array(int[] ints) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }
}

