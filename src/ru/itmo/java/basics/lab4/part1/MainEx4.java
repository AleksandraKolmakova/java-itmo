package ru.itmo.java.basics.lab4.part1;

import java.util.Scanner;

public class MainEx4 {

    static boolean result;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        mathEquation(a, b, c);
    }

    public static void mathEquation(int a, int b, int c) {
        if (b > a && c > b) {
            result = true;
            System.out.println("Результат: " + result);
        } else {
            result = false;
            System.out.println("Результат: " + result);
        }
    }
}

