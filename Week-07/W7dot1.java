import java.util.Scanner;

public class W7dot1 {

    public static void main(String[] args) {
	// Ask for user to input integer double
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter five double values: ");
        double array[] = new double[5];

    // Loops through user input integers
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

    // Output text for calculation report
        System.out.printf("The average of the numbers you entered is: %.2f", average(array));
        System.out.println("\nThank you for using this program, and goodbye!");
    }
    // Calculation of input numbers to determine the average
        public static double average(double[] array){
            double sum = 0;
            for (double i : array)
                sum += i;
            return sum / array.length;
        }
}