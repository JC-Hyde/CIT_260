import java.util.Scanner;

public class W6dot2 {

    public static void main(String[] args) {

        System.out.println("\nCelsius     Fahrenheit       |      Fahrenheit         Celsius\n" +
                            "--------------------------------------------------------------");

        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.format("%-15.1f", celsius);
            System.out.format("%5.1f         |", celsiusToFahrenheit(celsius));
            System.out.format("         %5.1f", fahrenheit);
            System.out.format("           %7.2f\n", fahrenheitToCelsius(fahrenheit));
        }
        System.out.println("\nOk campers, rise and shine!");
        System.out.println("And don't forget your booties 'cause it's");
        System.out.println("coooooold out there today.\n");
        System.out.println("It's cold out there everyday. What is this, Miami Beach?\n");
        System.out.println("Not hardly!");
    }

        public static double celsiusToFahrenheit(double c) {
            double f;
            f = (c * 9 / 5) +32;
            return f;
        }

        public static double fahrenheitToCelsius(double f) {
            double c;
            c = (f - 32) * 5 / 9;
            return c;
        }

}

