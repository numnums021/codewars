package com.company.kyu;

import java.util.List;
import java.util.stream.Collectors;

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

    /*
    * It's bonus time in the big city!
    * The fatcats are rubbing their paws in anticipation...
    * but who is going to make the most money?

    Build a function that takes in two arguments (salary, bonus).
    * Salary will be an integer, and bonus a boolean.

    If bonus is true, the salary should be multiplied by 10.
    * If bonus is false, the fatcat did not make enough money and must receive
    * only his stated salary.
    * */
    public static String bonusTime(final int salary, final boolean bonus) {
        return (bonus) ? "\u00A3" + salary * 10 : "\u00A3" + salary;
    }

    /*
     * Assume input will be only of Integer o String type
     */
    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
