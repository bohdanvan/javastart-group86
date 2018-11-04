package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ForEachExample {

    public static void main(String[] args) {
        int[] array = {10, 40, 30};

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            System.out.println(elem);
        }
        System.out.println();

        for (int elem : array) { // for-each
            elem = 1;
            System.out.println(elem);
        }

//        for (int i : array) {
//            System.out.println(array[i]);
//        }
    }
}
