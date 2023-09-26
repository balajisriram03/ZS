import java.util.*;

public class AreaCalc {
    static Scanner scanobj = new Scanner(System.in);

    public static double areaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }

    public static double areaOfSquare(double side) {
        return side * side;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void userChoice() {
        System.out.println("Choose from below options to calculate the respective area ");
        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Square");
        System.out.println("Enter 3 for Rectangle");
        System.out.println("Enter 4 for Triangle");

        int choice = scanobj.nextInt();

        if (choice == 1) {
            System.out.println("Enter the radius");
            double circleRadius = scanobj.nextDouble();
            System.out.println("Area of Circle: " + areaOfCircle(circleRadius) + " sq units");
        } else if (choice == 2) {
            System.out.println("Enter the side");
            double squareSide = scanobj.nextDouble();
            System.out.println("Area of Square: " + areaOfSquare(squareSide) + " sq units");
        } else if (choice == 3) {
            System.out.println("Enter the length");
            double rectangleLength = scanobj.nextDouble();
            System.out.println("Enter the breadth");
            double rectangleBreadth = scanobj.nextDouble();
            System.out.println("Area of Rectangle: " + areaOfRectangle(rectangleLength, rectangleBreadth) + " sq units");
        } else if (choice == 4) {
            System.out.println("Enter the base");
            double triangleBase = scanobj.nextDouble();
            System.out.println("Enter the height");
            double triangleHeight = scanobj.nextDouble();
            System.out.println("Area of Triangle: " + areaOfTriangle(triangleBase, triangleHeight) + " sq units");
        } else {
            System.out.println("Invalid Input, Retry");
        }
    }

    public static void main(String[] args) {
        userChoice();
    }
}
