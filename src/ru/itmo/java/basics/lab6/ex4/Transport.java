package ru.itmo.java.basics.lab6.ex4;

public abstract class Transport {
    protected Integer number;

    public Transport(Integer number) {
        this.number = number;
    }

    abstract void printTransportInfo();
}
