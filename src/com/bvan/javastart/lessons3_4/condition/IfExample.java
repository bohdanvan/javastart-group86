package com.bvan.javastart.lessons3_4.condition;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 25;

        if (x <= 20) {
            System.out.println("1");
            if (x >= 0) {
                System.out.println("4");
            }
        } else {
            System.out.println("2");
        }

        System.out.println("3");
    }
}
