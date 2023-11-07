package Useful.ServerClientConnection;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

class ReceiveMessage implements Runnable{
    Socket socket;
    String source;
    public ReceiveMessage(Socket socket, String source){
        this.socket = socket;
        this.source = source;
    }
    @Override
    public void run() {
        try{
            InputStreamReader ir = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(ir);
            String str = null;
            while (true) {
                if((str = br.readLine()) !=null){
                    System.out.println(source+": "+str);
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}