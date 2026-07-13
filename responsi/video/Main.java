package responsi.video;
import java.sql.*;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
         JOptionPane.showMessageDialog(null,
               "Nama: Wilma Auraruna Khalif\nNIM: A11.2024.15841",
               "Identitas Mahasiswa",
               JOptionPane.INFORMATION_MESSAGE);
               while (true){
                    String menu = """
                             --  Daftar Menu CRUD obat -- 
                             1. Tambah Obat
                             2. Tampilkan Obat
                             3. Ubah Obat
                             4. Delete Obat
                             5. Keluar
                             Pilih menu (menggunakan angka): 
                            """;
                    String pilihan = JOptionPane.showInputDialog(null, menu, "APK obat", JOptionPane.QUESTION_MESSAGE);
                    if (pilihan == null){
                        break;
                    }
                    switch (pilihan){
                        case "1":
                            crud.tambahData();
                            break;
                        case "2":
                            crud.tampilkanData();
                            break;
                        case "3":
                            crud.updateData();
                            break;
                        case "4":
                            crud.deleteData();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Pilihan Salah!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }
           }
    }
}

class CRUD {
    public void tambahData(){
        String sql = "INSERT INTO obat VALUES (?, ?, ?, ?, ?, ?, ?)";
        javax.swing.JTextField Kode = new javax.swing.JTextField();
        javax.swing.JTextField Nama = new javax.swing.JTextField();
        javax.swing.JTextField Satuan = new javax.swing.JTextField();
        javax.swing.JTextField Stok = new javax.swing.JTextField();
        javax.swing.JTextField Min = new javax.swing.JTextField();
        javax.swing.JTextField Expired = new javax.swing.JTextField();
        javax.swing.JTextField Supplier = new javax.swing.JTextField();

        Object[] formInput = {
            "Kode Obat:", Kode,
            "Nama Obat:", Nama,
            "Satuan Obat:", Satuan,
            "Stok Obat:", Stok,
            "Jumlah Minimum Obat:", Min,
            "Tanggal Expired Obat:", Expired,
            "Supplier:", Supplier,
        }; 
        int opsi = JOptionPane.showConfirmDialog(null, formInput, "Form Tambah Obat", JOptionPane.OK_CANCEL_OPTION);
       if (opsi == JOptionPane.OK_OPTION) {
           try (Connection conn = connectDB.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
               String kode = Kode.getText();
               String nama = Nama.getText();
               String satuan = Satuan.getText();
               int stok = Integer.parseInt(Stok.getText());
               int min = Integer.parseInt(Min.getText());
               String expired = Expired.getText();
               String supplier = Supplier.getText();
               pstmt.setString(1, kode);
               pstmt.setString(2, nama);
               pstmt.setString(3, satuan);
               pstmt.setInt(4, stok);
               pstmt.setInt(5, min);
               pstmt.setDate(6, Date.valueOf(expired));
               pstmt.setString(7, supplier);
              
               pstmt.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data obat berhasil ditambahkan!");
              
           } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Input Stok dan Min harus berupa angka!", "Error Input", JOptionPane.ERROR_MESSAGE);
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           }
       }
    }
    public void tampilkanData(){
         String sql = "SELECT * FROM obat";
       try (Connection conn = connectDB.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
          
           String semuaData = "--- DATA OBAT ---\n\n";
           boolean adaData = false;


           while (rs.next()) {
               adaData = true;
               String kode = rs.getString("kode_obat");
               String nama = rs.getString("nama_obat");
               String satuan = rs.getString("satuan_obat");
               int stok = rs.getInt("jml_stok");
               int min = rs.getInt("jml_min");
               Date expired = rs.getDate("expired_date");
               String supplier = rs.getString("supplier");


               semuaData += "Kode Obat    : " + kode + "\n" +
                            "Nama Obat    : " + nama + "\n" +
                            "Satuan       : " + satuan + "\n" +
                            "Stok / Min   : " + stok + " / " + min + "\n" +
                            "Tanggal Exp  : " + expired + "\n" +
                            "Supplier     : " + supplier + "\n" +
                            "-----------------------------------\n";
           }
          
           if (!adaData) {
               semuaData += "Tidak ada data obat di database.";
           }
          
           JOptionPane.showMessageDialog(null, semuaData, "Daftar Obat", JOptionPane.INFORMATION_MESSAGE);
          
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }

    }
    public void updateData(){
         String sql = "UPDATE obat SET nama_obat=?, jml_stok=? WHERE kode_obat=?";
       try (Connection conn = connectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
           String kode = JOptionPane.showInputDialog("Masukkan Kode Obat yang akan diubah:");
           String namaBaru = JOptionPane.showInputDialog("Nama Obat Baru:");
           int stokBaru = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Stok Baru:"));

           pstmt.setString(1, namaBaru);
           pstmt.setInt(2, stokBaru);
           pstmt.setString(3, kode);


           int rowsAffected = pstmt.executeUpdate();
           if (rowsAffected > 0) {
               JOptionPane.showMessageDialog(null, "Data obat berhasil diperbarui!");
           } else {
               JOptionPane.showMessageDialog(null, "Kode obat tidak ditemukan.", "Informasi", JOptionPane.WARNING_MESSAGE);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }  

    }
    public void deleteData(){
            String sql = "DELETE FROM obat WHERE kode_obat=?";
       try (Connection conn = connectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
           String kode = JOptionPane.showInputDialog("Masukkan Kode Obat yang ingin dihapus:");
           pstmt.setString(1, kode);
           int rowsAffected = pstmt.executeUpdate();
           if (rowsAffected > 0) {
               JOptionPane.showMessageDialog(null, "Data obat berhasil dihapus!");
           } else {
               JOptionPane.showMessageDialog(null, "Kode obat tidak ditemukan.", "Informasi", JOptionPane.WARNING_MESSAGE);
           }
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }

    }
}