package com.company.kyu;

public class Kyu5 {

    /*
    * Write a function that takes a string of parentheses,
    * and determines if the order of the parentheses is valid.
    * The function should return true if the string is valid,
    * and false if it's invalid.
    */
    public static boolean validParentheses(String parens) {
        String[] array = parens.split("");
        int openBracket = 0, closeBracket = 0;

        for (String s : array) {
            if (s.contains("(")) openBracket++;
            if (s.contains(")")) closeBracket++;
            if (closeBracket > openBracket) return false;
        }
        if (openBracket == 0) return true;
        return openBracket == closeBracket;
    }

    /*
    * The Fibonacci numbers are the numbers in the following integer sequence (Fn).
    * Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
    * F(n) * F(n+1) = prod.
    * */
    public static long[] productFib(long prod) {
        long firstNum = 0, secondNum = 1;
        while (firstNum * secondNum <= prod) {
            if ((firstNum * secondNum) == prod) {
                return new long[]{firstNum, secondNum, 1};
            }
            long tmp = firstNum;
            firstNum = secondNum;
            secondNum += tmp;
        }
        return new long[]{firstNum, secondNum, 0};
    }
}
