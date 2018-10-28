/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverterWithMethods {

    public static void main(String[] args) {
        System.out.println(10.0 + " °C -> " + toFahrenheit(10.0) + " °F");
        System.out.println(0.0 + " °C -> " + toFahrenheit(0.0) + " °F");
        System.out.println(-20.0 + " °C -> " + toFahrenheit(-20.0) + " °F");
    }

    private static double toFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}

// 10.0 °C -> 50.0 °F
// 0.0 °C -> 32.0 °F
// -20.0 °C -> -4.0 °F
