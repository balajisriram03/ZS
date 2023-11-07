public class ThreadExample extends Thread {
    String msg;

    public ThreadExample(String msg) {
        this.msg = msg;
        System.out.println("Hi");
    }

    public void run() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        ThreadExample obj1 = new ThreadExample("All the best");
        ThreadExample obj2 = new ThreadExample("Easy question today");
        // obj1.start();
        // obj2.start();
    }
}
