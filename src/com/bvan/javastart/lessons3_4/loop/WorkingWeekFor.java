package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class WorkingWeekFor {

    public static void main(String[] args) {
        // for ( 1 ; 2 ; 3 ) { ... }
        for (int day = 1; day <= 5; day++) {
            System.out.println(day + ": Work");
        }
    }
}
