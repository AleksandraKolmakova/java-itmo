package ru.itmo.java.basics.lab6.ex1;

import ru.itmo.java.basics.lab6.ex2.Interface;

public abstract class Person implements Interface {
    protected String firstName;
    protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract void Information();
}
