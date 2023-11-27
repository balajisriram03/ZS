public class HeavyCPUTask {

    public static void main(String[] args) {
        System.out.println("Starting Heavy CPU Task...");

        // Infinite loop to consume CPU
        while (true) {
            // Perform some CPU-intensive tasks
            doSomeProcessing();
        }
    }

    private static void doSomeProcessing() {
        // Simulate CPU-intensive tasks
        for (int i = 0; i < 1000000; i++) {
            double result = Math.sin(i) * Math.cos(i);
        }
    }
}
