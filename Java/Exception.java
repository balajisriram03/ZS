import java.io.*;

public class Exception {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file1.txt");
            FileWriter fw = new FileWriter("file2.txt");
            
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(new StringBuilder(line).reverse().toString() + "\n");
            }
            
            br.close();
            bw.close();
            System.out.println("File reading, reversing, and writing done");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("There was an IOException");
        }
    }
}
