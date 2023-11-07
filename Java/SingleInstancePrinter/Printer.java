package SingleInstancePrinter;

public class Printer {
    private static Printer instance = null;
    private int numberPages;

    private Printer() {}

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void print(String text) {
        numberPages++;
        System.out.println(text + " " + numberPages + " pages printed today");
    }
}