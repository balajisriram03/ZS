import java.io.InputStream;
import java.net.*;
import java.util.Scanner;

public class AdviceClient {
    public static void main(String args[]){
        AdviceClient ac = new AdviceClient();
        ac.connect();
    }
    public void connect(){
        try {
            Socket s = new Socket("10.52.0.100",4444);
            InputStream is = s.getInputStream();
            Scanner sc = new Scanner(is);
            System.out.println(sc.nextLine());
            sc.close();
        }
        catch(Exception ee){
            System.out.println("error  "+ee);
        }
    }
}