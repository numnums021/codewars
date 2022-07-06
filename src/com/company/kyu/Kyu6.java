package com.company.kyu;

public class Kyu6 {

    /*
    * Complete the solution so that the function
    * will break up camel casing, using a space between words.
    * */
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
