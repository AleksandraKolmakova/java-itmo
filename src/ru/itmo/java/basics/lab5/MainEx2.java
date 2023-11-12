package ru.itmo.java.basics.lab5;

public class MainEx2 {
    public static void main(String[] args) {
        String word1 = "потоп";
        String word2 = "око";
        String word3 = "клад";

        isPalindrom1(word1);
        isPalindrom1(word2);
        isPalindrom1(word3);
        isPalindrom2(word1);
        isPalindrom2(word2);
        isPalindrom2(word3);
    }

        public static void isPalindrom1(String word) {
        boolean isPalindrom = false;
        char[] chars = word.toCharArray();
        int right = chars.length - 1;
        for (int left = 0; left < chars.length / 2; left++) {
            if (chars[left] != chars[right]) {
                break;
            } else {
                right--;
            }
            isPalindrom = true;
        }
        System.out.println(isPalindrom);
    }
    public static void isPalindrom2(String word) {
        boolean isPalindrom = false;
        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (right > left) {
            if (chars[left] != chars[right]) {
                break;
            } else {
                ++left;
                --right;
            }
            isPalindrom = true;
        }
        System.out.println(isPalindrom);
    }

}


