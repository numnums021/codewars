package com.company.kyu;

import java.util.Arrays;
import java.util.Collections;

public class Kyu7 {

    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }

    public static long findNextSquare(long sq) {
        if ((sq < 0) || (Math.sqrt(sq) % 1 != 0))
            return -1;
        return (long) Math.pow(Math.sqrt(sq) + 1, 2);
    }

    /*
        p0 - население
        percent - процент увеличения населения в год
        avg - сколько жителей приходит в среднем в год
        p - необходимое население
        return - сколько лет необходимо городу?
    */
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 = p0 + (int) (p0 * (percent / 100)) + aug;
            years++;
        }
        return years;
    }

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    public static String oddOrEven (int[] array) {
        if (array.length == 0) return "0";
        int sum = 0;
        for (int s : array) sum += s;
        if (sum % 2 == 0) return "even";
        return "odd";
    }

    /*
    * Your task is to make a function that can take any non-negative integer as an argument
    * and return it with its digits in descending order. Essentially,
    * rearrange the digits to create the highest possible number.
    */
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }

}
