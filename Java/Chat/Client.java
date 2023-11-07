package Useful.ServerClientConnection;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("10.52.0.11",5500);
            System.out.println("Server Connected...");
            System.out.println("You are connected to the LIVE chat!\nPress ENTER to send message");
            Thread rm = new Thread(new ReceiveMessage(socket,"Server"));
            Thread sm = new Thread(new SendMessage(socket));
            sm.start();
            rm.start();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
