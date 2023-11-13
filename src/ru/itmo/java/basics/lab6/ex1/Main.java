package ru.itmo.java.basics.lab6.ex1;

import ru.itmo.java.basics.lab6.ex2.Interface;

public class Main {
    public static void main(String[] args) {

        Person client = new Client("Alex", "Smith", "VTB");
        Person bankWorker = new BankWorker("Mike", "Jonson", "VTB");

        client.Information();
        System.out.println(client.entrance());
        bankWorker.Information();
        System.out.println(bankWorker.entrance());
    }
}
