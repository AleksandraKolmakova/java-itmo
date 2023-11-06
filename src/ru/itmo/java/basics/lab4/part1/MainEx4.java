package ru.itmo.java.basics.lab4.part1;

import java.util.Scanner;

public class MainEx4 {
    int a;
    int b;
    int c;
    boolean result;

    public static void main(String[] args) {
        MainEx4 numbers = new MainEx4();
        numbers.enterNumbers();
        numbers.mathEquation();
    }

    public void enterNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        a = scanner.nextInt();
        System.out.println("Введите второе число:");
        b = scanner.nextInt();
        System.out.println("Введите третье число:");
        c = scanner.nextInt();
    }

    public void mathEquation() {
        if (b > a && c > b) {
            result = true;
            System.out.println("Результат: " + result);
        } else {
            result = false;
            System.out.println("Результат: " + result);
        }
    }
}

