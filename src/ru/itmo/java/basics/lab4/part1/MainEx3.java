package ru.itmo.java.basics.lab4.part1;

import java.util.Scanner;

public class MainEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int d = scanner.nextInt();
        System.out.println("Введите второе число:");
        int e = scanner.nextInt();
        System.out.println("Введите третье число:");
        int f = scanner.nextInt();
        boolean result;


        if (d + e == f) {
            result = true;
            System.out.println("Результат: " + result);
        } else {
            result = false;
            System.out.println("Результат: " + result);
        }
    }
}
