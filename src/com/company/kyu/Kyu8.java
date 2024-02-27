package com.company.kyu;

import java.util.List;
import java.util.stream.Collectors;

public class Kyu8 {

    //
//    Jack really likes his number five: the trick here is that you
//    have to multiply each number by 5 raised to the number of
//    digits of each numbers, so, for example:
//
    public static int multiply(int number) {
        // 5
        int ans = number;
        int len = number > 0 ? String.valueOf(number).length() : String.valueOf(number).length() -1;
        for (int i = 0; i < len; i++){
            ans *= 5;
        }

        return ans;
    }
    /*
      There are pillars near the road. The distance between the pillars is the same and the width of the pillars is the same.
      Your function accepts three arguments:
      - number of pillars (≥ 1);
      - distance between pillars (10 - 30 meters);
      - width of the pillar (10 - 50 centimeters).
      - Calculate the distance between the first and the last pillar in centimeters (without the width of the first and last pillar).
    */
    public int pillars(int numPill, int dist, int width){
        // Расстояние между первым и последним столбом без учёта их ширины
        if (numPill <= 1) return 0;
        if (dist < 10 || dist > 30) return 0;
        if (width < 10 || width > 50) return 0;

        return (numPill - 1) * dist * 100 + (numPill-2) * width;
    }

    // Implement a function which multiplies two numbers.
    public int multiply(int n1, int n2){
        return n1 * n2;
    }

    public static String buildString(String... args) {
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
