package Useful.ServerClientConnection;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class SendMessage implements Runnable{
    Socket socket;
    public SendMessage(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            while (true) {
                System.out.print("You: ");
                while(sc.hasNextLine()) {
                    System.out.print("You: ");
                    writer.println(sc.nextLine());
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}