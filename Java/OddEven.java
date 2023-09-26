import java.util.*;

public class OddEven {
    int num;

    public static void main(String args[]) {
        OddEven obj = new OddEven();
        obj.getNum();
        obj.getOutput();
    }

    public void getNum() {
        System.out.println("Enter any Number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
    }

    public void getOutput() {
        int tempNum = num;
        int rem;
        while (tempNum > 0) {
            rem = tempNum % 10;
            tempNum = tempNum / 10;
            if (rem % 2 == 0) {
                System.out.println(rem + " is even number");
            } else {
                System.out.println(rem + " is odd number");
            }
        }
    }
}
import java.util.Scanner;
public class AreaCalc{
    
    static double radius, side, length, breadth, base, height;
    static AreaCalc obj = new AreaCalc();
    static Scanner scanObj = new Scanner(System.in);
    
    public static double areaOfCircle(){
        Double area = 3.14*radius*radius;
        return area;
    }
    
    public static double areaOfSquare(){
        Double area = side*side;
        return area;
    }
    
    public static double areaOfRectangle(){
        Double area = length*breadth;
        return area;
    }
    
    public static double areaOfTriangle(){
        Double area = 0.5*base*height;
        return area;
    }
    
    public void userChoice(){
        System.out.println("Area Calculator \n"+"Enter 1 for Circle \n"+"Enter 2 for Square\n"+"Enter 3 for Rectangle \n"+"Enter 4 for Triangle \n");
        int choice = scanObj.nextInt();
        if (choice==1){
            System.out.println("Enter a radius :");
            radius = scanObj.nextDouble();
            System.out.println("Area of Circle = "+areaOfCircle()+" sq.units");
        }
        else if (choice==2){
            System.out.println("Enter a side :");
            side = scanObj.nextDouble();
            System.out.println("Area of Square = "+areaOfSquare()+" sq.units");
        }
        else if (choice==3){
            System.out.println("Enter a length :");
            length = scanObj.nextDouble();
            System.out.println("Enter a breadth :");
            breadth = scanObj.nextDouble();
            System.out.println("Area of Rectangle = "+areaOfRectangle()+" sq.units");
        }
        else if (choice==4){
            System.out.println("Enter a base :");
            base = scanObj.nextDouble();
            System.out.println("Enter a height :");
            height = scanObj.nextDouble();
            System.out.println("Area of Triangle = "+areaOfTriangle()+" sq.units");
        }
    }
    public static void main(String[] args) {
        AreaCalc obj = new AreaCalc();
        obj.userChoice();
    }
}
AreaCalc.java
image 2 of 13close
3