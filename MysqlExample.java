package ZS;

import java.sql.*;

public class MysqlExample {
    private String username = "balajisriram";
    private String password = "sensei123";
    public MysqlExample(){

    }
    public void queryExecution(){
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ZS2025",username,password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("show tables");
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getMetaData().getColumnName(i) + "\t");
            }
            System.out.println();
            while (rs.next()){
                for(int x=1; x<=columnCount; x++){
                    System.out.print(String.format("%-10s",rs.getString(x)+"\t"));
                }
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            try {
                con.close();
                stmt.close();
                rs.close();
            }
            catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MysqlExample mysql = new MysqlExample();
        mysql.queryExecution();
    }
}
