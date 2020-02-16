import java.util.Scanner;

public class W7dot2 {

    public static void main(String[] args) {
	// Gets input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        double array[] = new double[5];
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
    // Reports calculation of user inputs
        System.out.printf("Mean: %.2f %n", mean(array));
        System.out.printf("Deviation: %.5f %n", deviation(array));
    }
    // Equation to determine standard deviation
    public static double deviation(double[] x){
        double deviation = 0;
        int length = x.length - 1;
        double m = mean(x);
        for(double i: x) {
            deviation += Math.pow(i - m, 2);
        }
        return Math.sqrt(deviation / length);

    }
    // Equation to determine mean
    public static double mean(double[] x){
        double sum = 0;
        for(double i : x)
            sum += i;
        return sum / x.length;

    }
}
