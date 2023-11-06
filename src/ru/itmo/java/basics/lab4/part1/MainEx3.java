package ru.itmo.java.basics.lab4.part1;

import java.util.Scanner;

public class MainEx3 {
    int d;
    int e;
    int f;
    boolean result;

    public static void main(String[] args) {
        MainEx3 numbers = new MainEx3();
        numbers.enterNumbers();
        numbers.mathEquation();
    }

    public void enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        d = scanner.nextInt();
        System.out.println("Введите второе число:");
        e = scanner.nextInt();
        System.out.println("Введите третье число:");
        f = scanner.nextInt();
    }

    public void mathEquation() {
        if (d + e == f) {
            result = true;
            System.out.println("Результат: " + result);
        } else {
            result = false;
            System.out.println("Результат: " + result);
        }

    }
}
