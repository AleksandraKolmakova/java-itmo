package ru.itmo.java.basics.lab4.part2;

public class MainEx1 {
    public static void main(String[] args) {
        int[] ints1 = new int[]{3, -3, 7, 4, 5, 4};
        int[] ints2 = new int[]{1, 4, 5, 8};

        IsSortedArray(ints1);
        IsSortedArray(ints2);
    }

    public static void IsSortedArray(int[] ints) {
        for (int i = 1; i < ints.length - 1; i++) {
            if (ints[i] > ints[i + 1]) {
                System.out.println("Please, try again");
                break;
            } else {
                if (i == ints.length - 2) {
                    System.out.println("OK");
                }
            }
        }
    }
}
