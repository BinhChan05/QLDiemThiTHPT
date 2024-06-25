package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
public class dbConnection {
    private static final String username = "root";
    private static final String password = "1236547899";
    private static final String dataCon = "jdbc:mysql://localhost:3306/studentmanagement";
    private static Connection con = null;
    
    public static  Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataCon,username,password);            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
