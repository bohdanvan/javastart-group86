package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Geometry {

    public static void main(String[] args) {
        double area1 = rectangleArea(10, 20);
        double area2 = rectangleArea(30, 40);
        double area3 = circleArea(-10);

        System.out.println(area1); // 200
        System.out.println(area2); // 1200
        System.out.println(area3); // 314
    }

    public static double rectangleArea(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("negative size");
        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("negative radius: " + radius);
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
