import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final int MAX_CONNECTIONS = 5;
    private static int activeConnections = 0;
    private static List<String> waitingClients = new ArrayList<>();

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8898);
            System.out.println("Server started. Maximum connections: " + MAX_CONNECTIONS);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                if (activeConnections >= MAX_CONNECTIONS) {
                    // Inform the client that the server is busy
                    PrintWriter out = null;
                    try {
                        out = new PrintWriter(clientSocket.getOutputStream(), true);
                        out.println("Server is busy. Please try again later.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (out != null) {
                            out.close();
                        }
                        clientSocket.close();
                    }
                } else {
                    // Accept the client's connection
                    activeConnections++;
                    Thread clientHandlerThread = new Thread(() -> handleClient(clientSocket));
                    clientHandlerThread.start();
                }

                // Display waiting client information
                waitingClients.add(clientSocket.getInetAddress().getHostAddress());
                System.out.println("Waiting clients: " + waitingClients.size());
                for (String client : waitingClients) {
                    System.out.println("Client: " + client);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void handleClient(Socket clientSocket) {
        // Handle client requests here
        // ...

        // Disconnect the client
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        activeConnections--;
    }
}