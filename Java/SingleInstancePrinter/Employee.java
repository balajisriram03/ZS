package SingleInstancePrinter;

public class Employee extends User {
    private String role;
    private String position;

    public Employee(String name, String mailId, String role, String position) {
        super(name, mailId);
        this.role = role;
        this.position = position;
    }

    public void printCurrentRole() {
        System.out.println("Name: " + getName() + "\nPosition: " + position + "\nRole: " + role);
    }
}