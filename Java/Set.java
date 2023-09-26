public class Set {
    int data[];

    public Set() {
        this.data = new int[]{34, 56, 78, 90};
    }

    public Set(int[] data) {
        this.data = data;
    }

    public boolean isExists(int[] data, int value) {
        boolean isPresent = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public int length() {
        return this.data.length;
    }

    public int[] union(Set obj) {
        int[] arr = new int[this.length() + obj.length()];
        for (int i = 0; i < this.data.length; i++) {
            arr[i] = this.data[i];
        }
        int counter = this.data.length;
        for (int i = 0; i < obj.data.length; i++) {
            if (!isExists(arr, obj.data[i])) {
                arr[counter] = obj.data[i];
                counter++;
            }
        }
        return arr;
    }

    public String toString() {
        String res = "";
        if (data != null || data.length > 0) {
            res = " [";
            for (int i = 0; i < data.length; i++) {
                if (i != data.length - 1) {
                    res = res + data[i] + ", ";
                } else {
                    res = res + data[i] + "]";
                }
            }
        } else {
            res = "[]";
        }
        return res;
    }

    public int[] removeZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                j = j + 1;
            }
        }
        int[] finalArray = new int[j];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                finalArray[index] = arr[i];
                index++;
            }
        }
        return finalArray;
    }

    public static void main(String args[]) {
        Set setA = new Set(new int[]{23, 56, 78, 90});
        Set setB = new Set(new int[]{20, 50, 78, 95});
        int arr[] = setA.union(setB);
        int ll[] = new Set().removeZeros(arr);
        System.out.println("Final Array: ");
        System.out.print("[");
        for (int i = 0; i < ll.length - 1; i++) {
            System.out.print(ll[i] + ",");
        }
        System.out.println(ll[ll.length - 1] + "]");
    }
}