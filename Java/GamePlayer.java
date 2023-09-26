public class GamePlayer {

    private String name="";
    public GamePlayer(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
     public static void main(String args[]){
        GamePlayer gpObj =new GamePlayer("sasbenny");
        System.out.println("the name is  "+gpObj.getName());
    }

}