import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/college";
        String username="root";
        String password="qwerty@123";
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,username,password);
        System.out.println("Database connection established");
        }
        catch(Exception e){
            System.out.println("Cannot connect to database server"+e);
        }
    }
}

