package com.bvan.javastart.lessons3_4.loop;

/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        for (int n = 10; n <= 20 ; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 30; n >= 20 ; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 100; n <= 2000; n += 100) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
