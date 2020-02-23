public class W8dot1 {

    public static void main(String[] args) {

	// Enters parameters of the rectangles.
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

    // Prints output to console for first rectangle.
        System.out.println("Rectangle 1:");
        System.out.printf("Area: %.2f %n", rectangle1.getArea());
        System.out.printf("Perimeter: %.2f %n", rectangle1.getPerimeter());

    // Prints output to console for second rectangle.
        System.out.println("Rectangle 2:");
        System.out.printf("Area: %.2f %n", rectangle2.getArea());
        System.out.printf("Perimeter: %.2f %n", rectangle2.getPerimeter());
    }
}

    // Calculates the area and perimeter of the rectangles.
        class Rectangle{
            double width = 1;
            double height = 1;

            Rectangle(){
            }

            Rectangle(double newWidth, double newHeight){
                width = newWidth;
                height = newHeight;
            }

            double getArea(){
                return width * height;
            }

            double getPerimeter(){
                return width + height;
            }
    }