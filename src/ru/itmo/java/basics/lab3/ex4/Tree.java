package ru.itmo.java.basics.lab3.ex4;

public class Tree {
    private Integer age;
    private Boolean isLive;
    private String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean isLive, String name) {
        this.age = age;
        this.isLive = isLive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }


}
