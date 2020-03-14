public class Triangle extends GeometricObject {


    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    // Creates a default triangle
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }

    public double side2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    // Computes sides of the triangle to get the area
    public double getArea(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s *(s - side1) * (s - side2) * (s - side3));
    }

    // Computes sides of the triangle to get the perimeter
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public String toString(){
        return "Triangle: side 1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
    }
}
