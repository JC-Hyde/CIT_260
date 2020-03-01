import java.util.Scanner;

public class W9dot1 {

    public static void main(String[] args) {

    // Asks user for input
        Scanner input = new Scanner(System.in);

        System.out.println("This program takes an X and Y coordinate you enter");
        System.out.println("And calculates the distance from 0,0 to your points");
        System.out.println("\nPlease enter an X axis point: ");
        double xInput = input.nextDouble();

        System.out.println("\nPlease enter a Y axis point: ");
        double yInput = input.nextDouble();

	// Creates two points
        MyPoint point1 = new MyPoint(xInput, yInput);
        MyPoint point2 = new MyPoint(0,0);

    // Displays output of points to the console
        System.out.println("Result: ");
        System.out.println("Point 1: (" + point1.getX() + "' " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + "' " + point2.getY() + ")");
        System.out.printf("Distance: %.3f", point1.distance(point2));
        System.out.println("\nThank you for using my program. Goodbye!");
    }
}

class MyPoint {

    // Private variables
        private double x;
        private double y;

    // Default Constructor of 0,0
        MyPoint() {
            this(0,0);
        }

    // Main Constructor
        MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

    // Getters
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }

    // Formula to calculate point distance
        public double distance(MyPoint myPoint) {
            double distance = Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
            return distance;
        }

     // Returns calculation
        public double distance(double x, double y) {
            double distance = distance(new MyPoint(x,y));
            return distance;
        }
}
