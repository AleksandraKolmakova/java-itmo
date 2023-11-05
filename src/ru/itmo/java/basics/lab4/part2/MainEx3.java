package ru.itmo.java.basics.lab4.part2;
import java.util.Arrays;

public class MainEx3 {
    public static void main(String[] args) {
        int[] ints = new int[]{5, 6, 7, 2};
        System.out.println(("Array: " + Arrays.toString(ints)));

        ChangeElements(ints);
        System.out.println(("Changed Array: " + Arrays.toString(ints)));
    }

        public static void ChangeElements(int[] ints){
            int x = ints[0];
            ints[0] = ints[ints.length - 1];
            ints[ints.length - 1] = x;
        }

}

