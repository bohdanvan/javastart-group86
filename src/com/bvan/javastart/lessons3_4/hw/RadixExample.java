package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class RadixExample {

    public static void main(String[] args) {
        int a = 45676; // radix = 10
        int b = 0b100110; // radix = 2
        int c = 010; // radix = 8
        int d = 0xABBA; // radix = 16

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println(Integer.toBinaryString(a));
    }
}
