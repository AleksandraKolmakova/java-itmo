package ru.itmo.java.basics.lab6.ex5;

import java.util.Scanner;

public abstract class ParentUser {
    protected Integer age;

    Scanner scanner = new Scanner(System.in);

    public void getAge() {
        System.out.println("Введите свой возраст: ");
        age = scanner.nextInt();
    }
}
