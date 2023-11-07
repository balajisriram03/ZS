package SingleInstancePrinter;

public class MainPrinterDemo {
    public static void main(String[] args) {
        Employee john = new Employee("John", "john@example.com", "Boss", "Manager");
        john.printCurrentRole();

        Employee akshay = new Employee("Akshaya", "akshay@example.com", "Consultant", "Analyst");
        akshay.printCurrentRole();

        Employee stella = new Employee("Stella", "stella@example.com", "DevOps", "Engineer");
        stella.printCurrentRole();

        Employee joseph = new Employee("Joseph", "joseph@example.com", "Seller", "Salesperson");
        joseph.printCurrentRole();

        Printer printer = Printer.getInstance();
        printer.print("Printing document");
        printer.print("Printing another document");
    }
}
