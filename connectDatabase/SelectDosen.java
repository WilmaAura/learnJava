import java.sql.*;
import javax.swing.JOptionPane;
// Library JBDC
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
*/


public class SelectDosen {


   public static void main(String[] args) {


       String url = "jdbc:mariadb://localhost:3306/akademik_15841";
       String user = "root";
       String password = "";


       try (
           Connection conn =
               DriverManager.getConnection(url, user, password);
           Statement stmt =
               conn.createStatement();
           ResultSet rs =
               stmt.executeQuery("SELECT * FROM dosen");
       ) {
           System.out.println("=== DATA DOSEN ===");
           while (rs.next()) {
               String kode = rs.getString("kode_dos");
               String nama = rs.getString("nama_dos");
               String alamat = rs.getString("alamat_dos");
               String kota = rs.getString("kota_dos");
               Date tanggal = rs.getDate("tgl_masuk");
               System.out.println("---------------------");
               System.out.println("Kode    : " + kode);
               System.out.println("Nama    : " + nama);
               System.out.println("Alamat  : " + alamat);
               System.out.println("Kota    : " + kota);
               System.out.println("Masuk   : " + tanggal);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
