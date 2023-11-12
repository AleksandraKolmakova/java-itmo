package ru.itmo.java.basics.lab6.ex3;

public class Truck extends Car {
    private int maxWeight;
    private int wheelsNumber;

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void newWheels(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
        System.out.println("Количество колес грузовика " + wheelsNumber);
    }

    public Truck(int w, String m, char c, float s, Integer maxWeight, Integer wheelsNumber) {
        super(w, m, c, s);
        this.maxWeight = maxWeight;
        this.wheelsNumber = wheelsNumber;
    }

}
