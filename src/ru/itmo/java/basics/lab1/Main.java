package ru.itmo.java.basics.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");


        double a = (46 + 10) * (10 / 3d);
        int b = (29) * (4) * (-15);
        System.out.println(a);
        System.out.println(b);


        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println(result);


        double c = 3.6 * 4.1 * 5.9;
        System.out.println(c);


//        Ввести 42 100 125
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int sum = d + e + f;
        System.out.println(sum);



        int k = scanner.nextInt();
        if (k % 2 != 0) {
            System.out.println("Нечетное");
        } else if (k % 2 == 0 && k > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (k % 2 == 0) {
            System.out.println("Четное");
        }


    }
}
