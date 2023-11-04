package ru.itmo.java.basics.lab3.ex3;

import java.time.Year;

public class House {
    private Integer floorsNumber;
    private Integer year;
    private String name;

    public void Setter(Integer floorsNumber, Integer year, String name) {
        this.floorsNumber = floorsNumber;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "floorsNumber=" + floorsNumber +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public String printHouse() {
        return toString() + ", Количество лет с момента постройки: " + getDiffYears();
    }

    private int getDiffYears() {
        return Year.now().getValue() - year;
    }

}
