import java.util.Scanner;

public class ArrayCalc {
    private int[] arrNumber;

    public ArrayCalc() {
        arrNumber = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer values for the array:");
        for (int i = 0; i < 5; i++) {
            int no = sc.nextInt();
            arrNumber[i] = no;
        }
    }

    public void disp() {
        System.out.println("The given array:");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + " ");
        }
        System.out.println();
    }

    public int findMin() {
        int min = arrNumber[0];
        for (int i = 1; i < arrNumber.length; i++) {
            if (arrNumber[i] < min) {
                min = arrNumber[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        return min;
    }

    public int findMax() {
        int max = arrNumber[0];
        for (int i = 1; i < arrNumber.length; i++) {
            if (arrNumber[i] > max) {
                max = arrNumber[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
        return max;
    }

    public int sum() {
        int s = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            s += arrNumber[i];
        }
        System.out.println("The sum of the array is: " + s);
        return s;
    }

    public boolean isExists(int data) {
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] == data) {
                System.out.println("The given number " + data + " exists in the array.");
                return true;
            }
        }
        System.out.println("The given number " + data + " does not exist in the array.");
        return false;
    }

    public void indexOf(int index) {
        if (index >= 0 && index < arrNumber.length) {
            System.out.println("The value for the given index " + index + " is: " + arrNumber[index]);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public boolean isDivisible(int divisor) {
        int s = sum();
        if (s % divisor == 0) {
            System.out.println("The sum of the array is divisible by " + divisor);
            return true;
        } else {
            System.out.println("The sum of the array is not divisible by " + divisor);
            return false;
        }
    }

    public boolean isEvenOfSumOfTheArray() {
        int s = sum();
        if (s % 2 == 0) {
            System.out.println("The sum of the array is even.");
            return true;
        } else {
            System.out.println("The sum of the array is not even.");
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayCalc array = new ArrayCalc();
        System.out.println("The given Array is:");
        array.disp();
        array.findMin();
        array.findMax();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number to verify if it exists in the array:");
        int num = sc1.nextInt();
        array.isExists(num);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter an index number of the array to find its corresponding value:");
        int ind = sc2.nextInt();
        array.indexOf(ind);

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter a number to divide the sum of the array values:");
        int div = sc3.nextInt();
        array.isDivisible(div);
        array.isEvenOfSumOfTheArray();

    }
}
