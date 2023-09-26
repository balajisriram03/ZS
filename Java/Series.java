 import java.util.Arrays;
import java.util.Scanner;

public class Series {

    int arith;
    int geometric;

    public int getInput(String arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter for " + arg);
        return scan.nextInt();
    }

    public static void main(String[] args) {
        Series obj = new Series();
        obj.arith = obj.getInput("Arithmetic");
        obj.geometric = obj.getInput("Geometric");
        obj.arithSeries(obj.arith);
        obj.geometricSeries(obj.geometric);
    }

    public void arithSeries(int args) {
        int[] arithSeries = new int[4];
        arithSeries[0] = args;
        arithSeries[1] = args + 2;
        arithSeries[2] = args + 4;
        arithSeries[3] = args + 6;
        System.out.println(Arrays.toString(arithSeries));
    }

    public void geometricSeries(int args) {
        int[] geometricSeries = new int[4];
        geometricSeries[0] = 1;
        geometricSeries[1] = args;
        geometricSeries[2] = args * args;
        geometricSeries[3] = args * args * args;
        System.out.println(Arrays.toString(geometricSeries));
    }
}