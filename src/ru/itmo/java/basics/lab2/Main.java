package ru.itmo.java.basics.lab2;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("Сложение");
        System.out.println(cal.add(2, 3));
        System.out.println(cal.add(2.3, 3.2));
        System.out.println(cal.add(2000000L, 5000000L));
        System.out.println("\n");

        System.out.println("Вычитание");
        System.out.println(cal.sub(2, 3));
        System.out.println(cal.sub(10.0, 2.5));
        System.out.println(cal.sub(10000000L, 5000000L));
        System.out.println("\n");

        System.out.println("Умножение");
        System.out.println(cal.mult(2, 3));
        System.out.println(cal.mult(2.0, 1.5));
        System.out.println(cal.mult(2000000L, 5000000L));
        System.out.println("\n");

        System.out.println("Деление");
        System.out.println(cal.div(3, 3));
        System.out.println(cal.div(2.0, 0.5));
        System.out.println(cal.div(10000000L, 5000000L));

    }

}
