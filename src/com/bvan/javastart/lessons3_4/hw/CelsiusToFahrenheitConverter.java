package com.bvan.javastart.lessons3_4.hw;

/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        // Input
        double celsius = -20;

        // BL
        double fahrenheit = celsius * 1.8 + 32;

        // Output
        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }
}

// 10.0 °C -> 50.0 °F
// 0.0 °C -> 32.0 °F
// -20.0 °C -> -4.0 °F
