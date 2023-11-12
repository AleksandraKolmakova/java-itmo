package ru.itmo.java.basics.lab6.ex1;

import ru.itmo.java.basics.lab6.ex2.Interface;

public class Client extends Person implements Interface {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    void Information() {
        System.out.println("Person " + firstName + " " + lastName + " is client " + bankName + " bank");
    }

    @Override
    public String entrance() {
        return "Для клиентов банка доступ в помещение категории А запрещен" + "\n";
    }
}
