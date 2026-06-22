package responsi.logika;
import java.sql.*;

public class connectDB {
    public static Connection getConnection() {
        
        String url = "jdbc:mariadb://localhost:3306/obat";
        String user = "root";
        String password = "";
        
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }   
        return conn; 
    }
}