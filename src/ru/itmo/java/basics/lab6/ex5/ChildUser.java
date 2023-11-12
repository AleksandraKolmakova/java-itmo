package ru.itmo.java.basics.lab6.ex5;

public class ChildUser extends ParentUser {
    protected String name;

    @Override
    public void getAge() {
        System.out.println("Введите свое имя: ");
        name = scanner.next();
        System.out.println("Добро пожаловать, " + name + "!");
    }
}
