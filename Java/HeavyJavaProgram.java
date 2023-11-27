public class HeavyJavaProgram {

    public static void main(String[] args) {
        System.out.println("Starting Heavy Java Program...");

        // Infinite loop to consume CPU
        while (true) {
            try {
                // Perform some CPU-intensive tasks
                doSomeProcessing();

                // Allocate memory
                allocateMemory();
            } catch (OutOfMemoryError e) {
                System.err.println("OutOfMemoryError: " + e.getMessage());
            }
        }
    }

    private static void doSomeProcessing() {
        // Simulate CPU-intensive tasks
        for (int i = 0; i < 1000000; i++) {
            double result = Math.sin(i) * Math.cos(i);
        }
    }

    private static void allocateMemory() {
        // Simulate memory allocation
        byte[] array = new byte[1000000 * 1000]; // Allocate 1 GB of memory
    }
}
