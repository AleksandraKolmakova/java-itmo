package ru.itmo.java.basics.lab3.ex3;

public class HouseLogic {
    public static void main(String[] args) {
        House house1 = new House();
        house1.Setter(10, 1982, "Melody");
        System.out.println(house1.printHouse());

        House house2 = new House();
        house2.Setter(23, 2016, "Sky");
        System.out.println(house2.printHouse());
    }
}
