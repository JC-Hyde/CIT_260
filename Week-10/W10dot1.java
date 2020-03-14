import java.util.Scanner;

public class W10dot1 {

    public static void main(String[] args) {

    // Gets user input for triangle
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides of a triangle: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    // User inputs color for the triangle
    System.out.print("Pick a color for the triangle: ");
    String color = input.next();

    // Asks of user wishes to have the triangle a solid color
    System.out.print("Would you like the triangle to be a solid color? (True/False)");
    boolean filled = input.nextBoolean();
    Triangle triangle = new Triangle(side1, side2, side3);
    triangle.setColor(color);
    triangle.setFilled(filled);

    // Output to the user via the console
    System.out.println(" ");
    System.out.println("A triangle " + triangle.tostring());
    System.out.println("The color is " + triangle.getcolor());
    System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter());
    System.out.printf("The area is %.2f\n", triangle.getArea());
    System.out.println("Is the triangle filled? " + (triangle.isFilled() ? "" : " not ") + "filled");
    }
}
