package com.bvan.javastart.lessons7_8.recursion;

/**
 * @author bvanchuhov
 */
public class RecursionExample {

    public static void main(String[] args) {
        long res = factorial(100000);
        System.out.println(res);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative arg: " + n);
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long factorialWithLoop(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative arg: " + n);
        }
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}
