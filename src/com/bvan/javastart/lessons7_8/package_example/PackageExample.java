package com.bvan.javastart.lessons7_8.package_example;

import com.bvan.javastart.lessons7_8.practice.Geometry;

import java.util.Scanner;
import java.lang.*; // default

/**
 * @author bvanchuhov
 */
public class PackageExample {

    public static void main(String[] args) {
        Scanner scanner;
        String s = "Hello";
        System.out.println("Hello");

        double area = Geometry.circleArea(10);
        System.out.println(area);
    }
}
