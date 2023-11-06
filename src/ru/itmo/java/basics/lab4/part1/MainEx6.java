package ru.itmo.java.basics.lab4.part1;

public class MainEx6 {
    public static void main(String[] args) {

        int[] ints1 = new int[]{3, -3, 7, 4, 5, 4, 3};
        int[] ints2 = new int[]{7, 4, 5, 4, 1};
        int[] ints3 = new int[]{7, 4, 5, 4};

        System.out.println("This array contains number 1 or 3? : " + findElements(ints1));
        System.out.println("This array contains number 1 or 3? : " + findElements(ints2));
        System.out.println("This array contains number 1 or 3? : " + findElements(ints3));

    }

    public static boolean findElements(int[] ints) {
        boolean result = false;
        for (int x : ints) {
            if (x == 1 || x == 3) {
                result = true;
                break;
            } else
                result = false;
        }
        return result;
    }
}

