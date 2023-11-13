package ru.itmo.java.basics.lab6.ex1;

import ru.itmo.java.basics.lab6.ex2.Interface;

public class BankWorker extends Person implements Interface {

    private String bankName;

    public BankWorker(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    void Information() {
        System.out.println("Person " + firstName + " " + lastName + " works in " + bankName);
    }

    @Override
    public String entrance() {
        return "Для сотрудников банка доступ в помещение категории А разрешен" + "\n";
    }

}
