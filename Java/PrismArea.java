import java.util.Scanner;

public class PrismArea{
       int w;
       int l;
       int h;
       public void input(){
         Scanner scan = new Scanner (System.in);
         System.out.println("Enter the value of length ; ");
         l = scan.nextInt();
         System.out.println("Enter the value of width ; ");
         w = scan.nextInt();
         System.out.println("Enter the value of height; ");
         h = scan.nextInt();
         scan.close();
         
      }
      public int area(){
              int area= 2*(w*l + h*l+h*w);
              return area;
      }
      public static void main(String[] args){
             PrismArea obj = new PrismArea();
             obj.input();
             int result=obj.area();
             System.out.println(result);
     }
     
  }
         
