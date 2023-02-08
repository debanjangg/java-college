import java.sql.*;
public class DBClass{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/people";
    //Database credentials
    static final String USER = "root";
    static final String PASS = "";
    
    Connection conn = null;
    Statement stmt = null;
    
    String dbRegister(){
        String res = "";
        try{
            //Registering JDBC driver
            res += "Registering JDBC Driver... ";
            Class.forName("com.mysql.jdbc.Driver");
            res += "Registered.\n";
        }
        catch(ClassNotFoundException E){
            res += "Could not register JDBC Driver.\n";
        }
        return res;
    }
    String dbConnect(){
        String res = "";
        try{
            //Opening a conncetion
            res += "Connecting to the database... ";
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            if(conn != null)
                res += "Succesfully Connected\n";
            else
                res += "Couldn't Connect\n";
        }
        catch(SQLException E){
            res += "Could not connect to the Database.\n";
        }
        return res;
    }
    String createTable(){
        String res = "";
        try{
            res += "Creating Table... ";
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE people_info(Name varchar(30),Age integer,Gender varchar(10),Aadhar varchar(15) PRIMARY KEY);");
            res += "Table created.\n";
        }
        catch(SQLException E){
            res += "Table not created or already exists.\n";
        }
        return res;
    }
    String insertData(String name, int age, String gender,String aadhar){
        String res = "";
        try{
            res += "Inserting into table... ";
            stmt = conn.createStatement();
            String s = "INSERT INTO people_info"+" VALUES('"+name+"',"+age+",'"+gender+"','"+aadhar+"');";
            stmt.executeUpdate(s);
            res += "('"+name+"',"+age+",'"+gender+"','"+aadhar+"') Values inserted.\n";
        }
        catch(SQLException E){
            res += "Not inserted or duplicate Aadhar Number.\n";
        }
        return res;
    }
}
