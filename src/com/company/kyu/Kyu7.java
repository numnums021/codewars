package com.company.kyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Kyu7 {

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) return false;

        char[] testArray = test.toUpperCase().toCharArray();
        char[] originalArray = original.toUpperCase().toCharArray();

        Arrays.sort(testArray);
        Arrays.sort(originalArray);

        return Arrays.equals(testArray, originalArray);
    }

    /*
    * Complete the solution so that it returns
    * the greatest sequence of five consecutive digits found within the number given
    * */
    public static int solve(final String digits) {
        int maxFiveConsecutiveDigits = Integer.parseInt(digits.substring(0, 5));
        System.out.println("In start max_value = " + maxFiveConsecutiveDigits + ", length = " + digits.length());
        for (int i = 0; i < digits.length() - 4; i++) {
            int currentDigits = Integer.parseInt(digits.substring(i, i + 5));
            System.out.println("In loop # " + i + ". currentDigits = " +currentDigits);
            if (maxFiveConsecutiveDigits < currentDigits)
                maxFiveConsecutiveDigits = currentDigits;
        }
        return maxFiveConsecutiveDigits; // you code here
    }


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

    /*
    * You are going to be given a word. Your job is to return the middle character of the word.
    * If the word's length is odd, return the middle character.
    * If the word's length is even, return the middle 2 characters.
    * */
    public static String getMiddle(String word) {
        return (word.length() % 2 != 0) ? "" + word.charAt(word.length()/2):
                "" + word.charAt(word.length()/2 - 1) + word.charAt(word.length()/2);
    }

    /*
    * You will be given an array and a limit value. You must check that all values in the
    * array are below or equal to the limit value.
    * If they are, return true. Else, return false.

    You can assume all values in the array are numbers.
    * */
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).noneMatch(el -> el > limit);
    }
}
