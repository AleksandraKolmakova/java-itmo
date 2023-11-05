package ru.itmo.java.basics.lab4.part1;

import java.util.Arrays;

public class MainEx5 {
    public static void main(String[] args) {
        int[] ints1 = new int[]{3, -3, 7, 4, 5, 4, 3};
        int[] ints2 = new int[]{7, 4, 5, 4, 3};
        int[] ints3 = new int[]{3, -3, 7, 4, 5, 4};
        int[] ints4 = new int[]{7, 4, 5, 4};

        FirstLastElemArray(ints1);
        FirstLastElemArray(ints2);
        FirstLastElemArray(ints3);
        FirstLastElemArray(ints4);
    }

    public static void FirstLastElemArray(int[] ints) {
        if (ints.length >= 2) {
            System.out.println("array = " + Arrays.toString(ints));
            System.out.println("Number 3 is the first or the last element in this array: " + (ints[0] == 3 || ints[ints.length - 1] == 3) + "\n");
        }
    }


}
