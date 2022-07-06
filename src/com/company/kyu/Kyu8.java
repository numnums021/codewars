package com.company.kyu;

public class Kyu8 {
    // Implement a function which multiplies two numbers.
    public int multiply(int n1, int n2){
        return n1 * n2;
    }

    public static String buildString(String... args)
    {
        String answer = "I like ";
        for (int i = 0; i < args.length; i++) {
            if (i != args.length)
                answer += args[i].replace(" ","") + ",";
            else
                answer += args[i] + "!";
        }
        return answer;
    }
}
