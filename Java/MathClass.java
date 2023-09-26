import java.util.*;

public class MathClass {
    static float x = 17.5;
    static float y = 20.5;

    public static void main(String[] args) {
        addExact(x, y);
        getMin();
        getMax();
        subtractExact(x, y);
        multiplyExact(x, y);
    }

    public static void addExact(float x, float y) {
        System.out.println("The sum of x and y is: ");
        System.out.println(Math.addExact(x, y));
    }

    public static void getMin() {
        System.out.println("The minimum of x and y is: ");
        System.out.println(Math.min(x, y));
    }

    public static void getMax() {
        System.out.println("The maximum of x and y is: ");
        System.out.println(Math.max(x, y));
    }

    public static void subtractExact(float x, float y) {
        System.out.println("The difference of x and y is: ");
        System.out.println(Math.subtractExact(x, y));
    }

    public static void multiplyExact(float x, float y) {
        System.out.println("The product of x and y is: ");
        System.out.println(Math.multiplyExact(x, y));
    }
}