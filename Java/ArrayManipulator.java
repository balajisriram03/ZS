import java.util.*;

public class ArrayManipulator {
    private int[] data;

    public ArrayManipulator() {
        this.data = new int[]{1, 2, 3, 4};

    public ArrayManipulator(int[] data) {
        this.data = data;
    }

    public ArrayManipulator add(int elementToAdd) {
        int[] temp = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        temp[temp.length - 1] = elementToAdd;
        return new ArrayManipulator(temp);
    }

    public ArrayManipulator remove(int indexToRemove) {
        int[] temp = new int[data.length - 1];
        int currentIndex = 0;
        for (int  i = 0; i < data.length; i++) {
            if (i != indexToRemove) {
                temp[currentIndex] = data[i];
                currentIndex++;
            }
        }
        return new ArrayManipulator(temp);
    }
Random();
        
    public ArrayManipulator modify(int index, int value) {
        int[] temp = new int[data.length];
        for (int i = 0; i < temp.length; i++) {
            if (i != index) {
                temp[i] = data[i];
            } else {
                temp[i] = value;
            }
        }
        return new ArrayManipulator(temp);
    }

    public String toString() {
        String res = "[";
        if (data != null && data.length > 0) {
            for (int i = 0; i < data.length - 1; i++) {
                res += data[i] + ", ";
            }
            res += data[data.length - 1] + "]";
        } else {
            res = "[]";
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayManipulator manipulate = new ArrayManipulator();
        System.out.println("Initial Array: " + manipulate);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an element to add: ");
        int element = scan.nextInt();
        System.out.println("Modified Array with Element added: " + manipulate.add(element));

        System.out.print("Enter an index to remove: ");
        int index = scan.nextInt();
        System.out.println("Modified Array with specified index removed: " + manipulate.remove(index));

        System.out.print("Enter an index to modify: ");
        int modifyIndex = scan.nextInt();

        System.out.print("Enter the value: ");
        int modifyValue = scan.nextInt();
        System.out.println("Modified Array with Value Replaced: " + manipulate.modify(modifyIndex, modifyValue));
    }
}
