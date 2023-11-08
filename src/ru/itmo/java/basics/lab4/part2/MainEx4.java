package ru.itmo.java.basics.lab4.part2;

import java.util.Arrays;

public class MainEx4 {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 1, 2, 4};
        System.out.println(("Array: " + Arrays.toString(ints)));

        firstUniqueElement(ints);
    }

    public static void firstUniqueElement(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            boolean result = true;
            for (int k = 0; k < ints.length && result; k++)
                result = (i == k || ints[i] != ints[k]);

            if (result) {
                System.out.println(ints[i]);
                break;
            }
        }
    }
}
