import java.util.Scanner;

public class EquationSolver {
    int coefficientA;
    int coefficientB;
    int coefficientC;
    int valueX;

    public int getCoefficientA() {
        return coefficientA;
    }

    public void setCoefficientA() {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        coefficientA = s;
    }

    public int getCoefficientB() {
        return coefficientB;
    }

    public void setCoefficientB() {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        coefficientB = s;
    }

    public int getCoefficientC() {
        return coefficientC;
    }

    public void setCoefficientC() {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        coefficientC = s;
    }

    public int getValueX() {
        return valueX;
    }

    public void setValueX() {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        valueX = s;
    }

    public void calculateEquation() {
        float result = getCoefficientA() * (getValueX() * getValueX()) + getCoefficientB() * getValueX() + getCoefficientC();
        System.out.println("Result: " + result);
    }

    public static void main(String args[]) {
        EquationSolver obj = new EquationSolver();
        System.out.println("Ax^2 + Bx + C");
        System.out.println("Enter value of A: ");
        obj.setCoefficientA();
        System.out.println("Enter value of B: ");
        obj.setCoefficientB();
        System.out.println("Enter value of C: ");
        obj.setCoefficientC();
        System.out.println("Enter value of x: ");
        obj.setValueX();
        System.out.println("Answer : ");
        obj.calculateEquation();
    }
}
