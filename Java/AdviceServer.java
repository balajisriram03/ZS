import java.io.*;
import java.net.*;
import java.util.Scanner;

public class AdviceServer {
    public static void main(String args[]){
        AdviceServer as = new AdviceServer();
        as.listen();
    }
    public void listen(){
        PrintWriter pw = null;
        int count=1;
        try {
            ServerSocket ss = new ServerSocket(6969);
            System.out.println("Server is waiting for clients...");
            while(true){
                Socket com = ss.accept();
                System.out.println(count+" Clients connected...");
                OutputStream is = com.getOutputStream();
                pw = new PrintWriter(is);
                pw.println("You are connected to a group of "+count+" members!");
                pw.flush();
                count++;
            }
        }
        catch(IOException ee){
            System.out.println("error  "+ee);
        }
    }
}