package ru.itmo.java.basics.lab6.ex4;

public class Bus extends Transport {

    public Bus(Integer number) {
        super(number);
    }

    @Override
    void printTransportInfo() {
        System.out.println("Количество колес " + number);
    }
}
