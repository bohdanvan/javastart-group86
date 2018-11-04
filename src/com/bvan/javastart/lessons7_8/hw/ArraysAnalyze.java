package com.bvan.javastart.lessons7_8.hw;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraysAnalyze {

    public static void main(String[] args) {
        // 1
        boolean[] bools = new boolean[30];

        // 2
        double[] doubles1 = new double[4];
        doubles1[0] = 10.2;
        doubles1[1] = 5.6;

        double[] doubles2 = {10.2, 5.6, 7.8, 11.9};

        // 3
        int[] array = {10, 30, 20};
        int len = array.length;

        // 4
        String s = Arrays.toString(array);
        System.out.println(s);

        // 5
        int[] array2 = new int[10];
        Arrays.fill(array2, 42);
        System.out.println(Arrays.toString(array2));

        // 6
        int[] array3 = {20, 10, 30};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

        // 7
        int[] array4 = {-10, 0, 40, 20, -5};
        for (int i = 0; i < array4.length; i++) { // 0, 1, 2, 3, 4
            int elem = array4[i];
            if (elem > 0) {
                System.out.print(i + " "); // 2, 3
            }
        }
        System.out.println();

        // 8
        for (int i = 0; i < array4.length; i++) { // 0, 1, 2, 3, 4
            int elem = array4[i]; // -10, 0, 40, 20, -5
            if (elem > 0) {
                System.out.print(elem + " "); // 40, 20
            }
        }
        System.out.println();

        for (int elem : array4) { // -10, 0, 40, 20, -5
            if (elem > 0) {
                System.out.print(elem + " "); // 40, 20
            }
        }
        System.out.println();

        // 9
        for (int i = array4.length - 1; i >= 0; i--) { // 4, 3, 2, 1, 0
            int elem = array4[i];  // -5, 20, 40, 0, -10
            if (elem > 0) {
                System.out.print(elem + " "); // 20, 40
            }
        }
        System.out.println();
    }
}
