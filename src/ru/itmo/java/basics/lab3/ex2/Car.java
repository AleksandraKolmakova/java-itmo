package ru.itmo.java.basics.lab3.ex2;

public class Car {
    private String color;
    private String name;
    private Double weight;

    public Car() {
    }
    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String printCar() {
        return toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}
