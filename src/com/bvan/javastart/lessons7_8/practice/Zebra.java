package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Zebra {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createZebra(4))); // [black, white, black, white]

        System.out.println(Arrays.toString(createZebra(5))); // [black, white, black, white, black]

        System.out.println(Arrays.toString(createZebra(100)));
    }

    public static String[] createZebra(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size: " + size);
        }

        String[] zebra = new String[size];

        for (int i = 0; i < zebra.length; i++) {
//            if (i % 2 == 0) {
//                zebra[i] = "black";
//            } else {
//                zebra[i] = "white";
//            }

            zebra[i] = (i % 2 == 0) ? "black" : "white";
        }

        return zebra;
    }
}

