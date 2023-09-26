public class CustomCalc {

    public static double mean(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;
    }

    public static int findMin(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static int findMax(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public static double findMinSqrt(int num1, int num2) {
        int min = Math.min(num1, num2);
        return Math.sqrt(min);
    }

    public static double findMaxSqrt(int num1, int num2) {
        int max = Math.max(num1, num2);
        return Math.sqrt(max);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;

        double meanResult = mean(num1, num2, num3);
        System.out.println("Mean: " + meanResult);

        int minResult = findMin(num1, num2, num3);
        System.out.println("Minimum: " + minResult);

        int maxResult = findMax(num1, num2, num3);
        System.out.println("Maximum: " + maxResult);

        double minSqrtResult = findMinSqrt(num1, num2);
        System.out.println("Square root of minimum: " + minSqrtResult);

        double maxSqrtResult = findMaxSqrt(num1, num2);
        System.out.println("Square root of maximum: " + maxSqrtResult);
    }
}
