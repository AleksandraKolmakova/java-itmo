package ru.itmo.java.basics.lab3.ex2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("BMW");
        car1.setColor("Black");
        car1.setWeight(1000d);

        Car car2 = new Car();
        car2.setName("BMW");
        car2.setColor("Red");
        car2.setWeight(1500d);

        System.out.println(car1.printCar());
        System.out.println(car2.printCar());
    }
}
