package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraysExample {

    public static void main(String[] args) {
//        int[] array = {10, 40, 20};
        int[] array = new int[5];

        int len = array.length;
        System.out.println("len = " + len);

        array[1] = 30;
        array[array.length - 1] = 50;

//        array[100] = 10; // ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(array));
    }
}
