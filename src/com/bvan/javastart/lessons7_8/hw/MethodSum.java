package com.bvan.javastart.lessons7_8.hw;

/**
 * @author bvanchuhov
 */
public class MethodSum {

    public static void main(String[] args) {
        int x = 10;
        int y = sum(x, 30); // 40
        int z = sum(y, sum(x, 20)); // 70
        System.out.println(z); // 70
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
