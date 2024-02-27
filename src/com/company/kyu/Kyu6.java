package com.company.kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kyu6 {
    /*
    * A Narcissistic Number (or Armstrong Number) is a positive number
    * which is the sum of its own digits, each raised to the power of the
    * number of digits in a given base.
    * In this Kata, we will restrict ourselves to decimal (base 10).
    */
    public static boolean isNarcissistic(int number) {
        int length = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(m -> Math.pow(m, length))
                .sum();
    }

    /*
    * Complete the solution so that the function
    * will break up camel casing, using a space between words.
    * */
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    /*
        Some numbers have funny properties. For example:
        89 --> 8¹ + 9² = 89 * 1
        695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
        46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

        Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
        we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
        In other words:
        Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
        If it is the case we will return k, if not return -1.
        Note: n and p will always be given as strictly positive integers.
    * */
    public static long digPow(int n, int p) {
        String [] arrayInt = String.valueOf(n).split("");
        long tmp = 0;
        for (String i : arrayInt) {
            tmp += Math.pow(Integer.parseInt(i), p);
            p++;
        }
        if (tmp % n == 0)
            return tmp / n;
        return -1;
    }

    /*You probably know the "like" system from Facebook and other pages.
    People can "like" blog posts, pictures or other items.
    We want to create the text that should be displayed next to such an item.

    Implement the function which takes an array containing the names of people that like an item.
    It must return the display text as shown in the examples:*/
    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

    /*
    You are given three integer inputs: length, minimum, and maximum.
    Return a string that:
    1) Starts at minimum
    2) Ascends one at a time until reaching the maximum, then
    3) Decends one at a time until reaching the minimum
    4) repeat until the string is the appropriate length
    */
    public static String ascendDescend(int length, int minimum, int maximum) {
        StringBuilder ans = new StringBuilder();

        if (minimum > maximum) return "";
        if (maximum == minimum) {
            for (int i = 0; i < length; i++) {
                ans.append(maximum);
            }
            return String.valueOf(ans);
        }

        int tmp = minimum;
        boolean f = true;
        while (ans.length() != length) {
            if (tmp < 0)    ans.append("-").append(Math.abs(tmp));
            else ans.append(tmp);
            if (f) tmp++;
            else tmp--;

            if (tmp == maximum) f = false;
            if (tmp == minimum) f = true;
        }
        return ans.toString();
    }

    /*
    * Place all people in alphabetical order where Mothers are followed by their children,
    * i.e. "aAbaBb" => "AaaBbb".
    * */
    public static String findChildren(final String text) {
        if (text.isEmpty()) return text;

        return text;
    }

    public static int digitalRoot(int n) {
        String numStr = Integer.toString(n);
        while (numStr.length() != 1) {
            int tmp = 0;
            for (int i = 0; i < numStr.length(); i++) {
                tmp += Integer.parseInt(String.valueOf(numStr.charAt(i)));
            }
            numStr = Integer.toString(tmp);
        }
        return Integer.parseInt(numStr);
    }

}
