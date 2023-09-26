// public class LiteralExample {
//     public static void main(String[] args) {
//         int number1 = 0b01010000101000101101000010100010;
//         int number2 = 0b0101_0000_1010_0010_1101_0000_1010_0010;
//         int number3 = 2_123_456;
        
//         long sum = 123;
//         long bigSum = 1234567890123L;
//         long negativeSum = -9876543210L;
        
//         System.out.println("number1: " + number1);
//         System.out.println("number2: " + number2);
//         System.out.println("number3: " + number3);
        
        
//         System.out.println("sum: " + sum);
//         System.out.println("bigSum: " + bigSum);
//         System.out.println("negativeSum: " + negativeSum);
//     }
// }

import java.util.Scanner;

public class AreaCalc {
    private static Scanner scanObj = new Scanner(System.in);

    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfSquare(double side) {
        return side * side;
    }

    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void userChoice() {
        System.out.println("Area Calculator");
        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Square");
        System.out.println("Enter 3 for Rectangle");
        System.out.println("Enter 4 for Triangle");

        int choice = scanObj.nextInt();

        if (choice == 1) {
            System.out.println("Enter the radius:");
            double circleRadius = scanObj.nextDouble();
            System.out.println("Area of Circle = " + areaOfCircle(circleRadius) + " sq.units");
        } else if (choice == 2) {
            System.out.println("Enter the side:");
            double squareSide = scanObj.nextDouble();
            System.out.println("Area of Square = " + areaOfSquare(squareSide) + " sq.units");
        } else if (choice == 3) {
            System.out.println("Enter the length:");
            double rectangleLength = scanObj.nextDouble();
            System.out.println("Enter the breadth:");
            double rectangleBreadth = scanObj.nextDouble();
            System.out.println("Area of Rectangle = " + areaOfRectangle(rectangleLength, rectangleBreadth) + " sq.units");
        } else if (choice == 4) {
            System.out.println("Enter the base:");
            double triangleBase = scanObj.nextDouble();
            System.out.println("Enter the height:");
            double triangleHeight = scanObj.nextDouble();
            System.out.println("Area of Triangle = " + areaOfTriangle(triangleBase, triangleHeight) + " sq.units");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {
        userChoice();
    }
}