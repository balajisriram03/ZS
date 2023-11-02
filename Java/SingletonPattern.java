public class SingletonPattern {
    private static SingletonPattern pattern = null;
    private int num = 0;

    private SingletonPattern() {
        num = 10;
    }

    public static SingletonPattern getInstance() {
        if (pattern == null) {
            pattern = new SingletonPattern();
        }
        return pattern;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        // Get an instance of SingletonPattern
        SingletonPattern instance1 = SingletonPattern.getInstance();

        // Set a value for num
        instance1.setNum(20);

        // Get another instance of SingletonPattern
        SingletonPattern instance2 = SingletonPattern.getInstance();

        // Print the value of num from both instances
        System.out.println("Value of num in instance1: " + instance1.getNum());
        System.out.println("Value of num in instance2: " + instance2.getNum());
    }
}
