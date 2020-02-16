import java.util.Scanner;

public class W2dot1 {

    public static void main(String[] args) {

        // This app converts Celsius to Fahrenheit

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double farenheit = (9.0 / 5) * celsius + 32;
        System.out.println(String.format("%.2f",celsius) + " Celsius is " + String.format("%.2f",farenheit) + " Fahrenheit");
    }
}
