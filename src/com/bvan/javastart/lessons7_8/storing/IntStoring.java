package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class IntStoring {

    public static void main(String[] args) {
        int x = 10;
        int y = x;

        y++;

        System.out.println(x); // 10
        System.out.println(y); // 11
    }
}
