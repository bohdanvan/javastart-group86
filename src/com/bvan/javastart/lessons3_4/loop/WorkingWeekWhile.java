package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekWhile {

    public static void main(String[] args) {
        int day = 1; // (1) init

        while (day <= 5) { // (2) loop condition
            System.out.println(day + ": Work");
            day++; // (3) increment
        }

        System.out.println("Yahooo!!!");
    }
}
