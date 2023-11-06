public class SAdviceServer {
    private static SAdviceServer instance;

    private SAdviceServer() {
        
    }

    public static SAdviceServer getInstance() {
        if (instance == null) {
            instance = new SAdviceServer();
        }
        return instance;
    }

    public void startServer() {
        System.out.println("Starting the server...");
    }

    public static void main(String[] args) {
        SAdviceServer server = SAdviceServer.getInstance();
        if (server != null) {
            System.out.println("Server instance already exists.");
        } else {
            server = SAdviceServer.getInstance();
            server.startServer();
        }
    }
}
