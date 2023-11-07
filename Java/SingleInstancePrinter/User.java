package SingleInstancePrinter;

public class User {
    private String name;
    private String mailID;

    public User(String name, String mailID) {
        this.name = name;
        this.mailID = mailID;
    }

    public String getName() {
        return name;
    }

    public String getMailID() {
        return mailID;
    }
}