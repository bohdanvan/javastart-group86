package com.bvan.javastart.lessons5_6.hw;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter from: ");
        int from = scanner.nextInt();

        System.out.print("Enter to: ");
        int to = scanner.nextInt();

        // validation
        if (from > to) {
            System.out.println("Illegal from and to");
            System.exit(-1);
        }

        for (int n = from; n <= to; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
