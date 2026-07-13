package responsi.video;
import java.sql.*;
// Library JBDC
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
*/


public class connectDB {
    public static Connection getConnection(){
        String url = "jdbc:mariadb://localhost:3306/obat";
        String user= "root";
        String passw = "";
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user,passw);

        }catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
