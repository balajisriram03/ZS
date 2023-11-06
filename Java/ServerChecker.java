import java.io.IOException;
import java.net.Socket;

public class ServerChecker {
    private static final int SERVER_PORT = 8888;
    private static final String SERVER_HOST = "localhost";
    
    public static boolean isServerRunning() {
        try {
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            socket.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        if (isServerRunning()) {
            System.out.println("Server is already running.");
        } else {
            System.out.println("Server is not running. Starting the server...");
        }
    }
}
