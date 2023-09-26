import java.util.*;
public class Chessboard{
    String[][] Board=new String[8][8];
    public void createchessboard(){
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                Board[i][j]="";
            }
        }
    }
    public void setboard(){
        Board[0][0] = "\u001B[48;5;0m♜\u001B[0m";
        Board[0][1] = "\u001B[48;5;15m♞\u001B[0m";
        Board[0][2] = "\u001B[48;5;0m♝\u001B[0m";
        Board[0][3] = "\u001B[48;5;15m♛\u001B[0m";
        Board[0][4] = "\u001B[48;5;0m♚\u001B[0m";
        Board[0][5] = "\u001B[48;5;15m♝\u001B[0m";
        Board[0][6] = "\u001B[48;5;0m♞\u001B[0m";
        Board[0][7] = "\u001B[48;5;15m♜\u001B[0m";

        Board[1][0] = "\u001B[48;5;15m♟\u001B[0m";
        Board[1][1] = "\u001B[48;5;0m♟\u001B[0m";
        Board[1][2] = "\u001B[48;5;15m♟\u001B[0m";
        Board[1][3] = "\u001B[48;5;0m♟\u001B[0m";
        Board[1][4] = "\u001B[48;5;15m♟\u001B[0m";
        Board[1][5] = "\u001B[48;5;0m♟\u001B[0m";
        Board[1][6] = "\u001B[48;5;15m♟\u001B[0m";
        Board[1][7] = "\u001B[48;5;0m♟\u001B[0m";
        for(int i=2;i<6;i++){
          for(int j=0;j<8;j++){
            if ((i+j)%2==0){
          Board[i][j]="\033[40m"+" "+"\033[0m";
        }
        else{
          Board[i][j]="\033[47m"+" "+"\033[0m";
        }
          
      }
         
      } 
      Board[7][0] = "\u001B[48;5;15m♖\u001B[0m";
      Board[7][1] = "\u001B[48;5;0m♘\u001B[0m";
      Board[7][2] = "\u001B[48;5;15m♗\u001B[0m";
      Board[7][3] = "\u001B[48;5;0m♕\u001B[0m";
      Board[7][4] = "\u001B[48;5;15m♔\u001B[0m";
      Board[7][5] = "\u001B[48;5;0m♗\u001B[0m";
      Board[7][6] = "\u001B[48;5;15m♘\u001B[0m";
      Board[7][7] = "\u001B[48;5;0m♖\u001B[0m";

      Board[6][0] = "\u001B[48;5;0m♙\u001B[0m";
      Board[6][1] = "\u001B[48;5;15m♙\u001B[0m";
      Board[6][2] = "\u001B[48;5;0m♙\u001B[0m";
      Board[6][3] = "\u001B[48;5;15m♙\u001B[0m";
      Board[6][4] = "\u001B[48;5;0m♙\u001B[0m";
      Board[6][5] = "\u001B[48;5;15m♙\u001B[0m";
      Board[6][6] = "\u001B[48;5;0m♙\u001B[0m";
      Board[6][7] = "\u001B[48;5;15m♙\u001B[0m";
 
       
}
public void printBoard() {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            System.out.print(Board[i][j]);
        }
        System.out.println();
    }
}
  public static void main(String[] args) {
    Chessboard c = new Chessboard();
    c.createchessboard(); 
    c.setboard();
    c.printBoard();
    
      
     } 
  }

