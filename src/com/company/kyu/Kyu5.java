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
}
