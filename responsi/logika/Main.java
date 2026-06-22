package responsi.logika;

import java.sql.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
        
        // Menampilkan Nama dan NIM di awal program
        JOptionPane.showMessageDialog(null, 
                "Nama: Wilma Auraruna Khalif\nNIM: A11.2024.15841", 
                "Identitas Mahasiswa", 
                JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            String menu = """
                    == Daftar Menu CRUD Obat ==
                    1. Tambah Obat
                    2. Lihat Obat
                    3. Ubah Obat
                    4. Delete Obat
                    5. Keluar
                    
                    Pilih menu (masukkan angka):""";
            
            String pilihan = JOptionPane.showInputDialog(null, menu, "Aplikasi Obat", JOptionPane.QUESTION_MESSAGE);
            
            // Jika user menekan tombol Cancel atau menyilang dialog pop-up
            if (pilihan == null) {
                break;
            }

            switch (pilihan) {
                case "1":
                    crud.tambahObat();
                    break;
                case "2":
                    crud.lihatObat();
                    break;
                case "3":
                    crud.ubahObat();
                    break;
                case "4":
                    crud.deleteObat();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Thanks");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan Salah Silahkan Ulangi lagi", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        }  
    }
}

class CRUD {
    
    public void tambahObat () {
        String sql = "INSERT INTO obat VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        javax.swing.JTextField txtKode = new javax.swing.JTextField();
        javax.swing.JTextField txtNama = new javax.swing.JTextField();
        javax.swing.JTextField txtSatuan = new javax.swing.JTextField();
        javax.swing.JTextField txtStok = new javax.swing.JTextField();
        javax.swing.JTextField txtMin = new javax.swing.JTextField();
        javax.swing.JTextField txtExpired = new javax.swing.JTextField();
        javax.swing.JTextField txtSupplier = new javax.swing.JTextField();

        Object[] formInput = {
            "Kode Obat:", txtKode,
            "Nama Obat:", txtNama,
            "Satuan Obat:", txtSatuan,
            "Jumlah Stok:", txtStok,
            "Jumlah Min:", txtMin,
            "Expired Date (YYYY-MM-DD):", txtExpired,
            "Supplier:", txtSupplier
        };

        int opsi = JOptionPane.showConfirmDialog(null, formInput, "Form Tambah Obat", JOptionPane.OK_CANCEL_OPTION);
        
        if (opsi == JOptionPane.OK_OPTION) {
            try (Connection conn = connectDB.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                String kode = txtKode.getText();
                String nama = txtNama.getText();
                String satuan = txtSatuan.getText();
                int stok = Integer.parseInt(txtStok.getText());
                int min = Integer.parseInt(txtMin.getText());
                String expired = txtExpired.getText();
                String supplier = txtSupplier.getText();

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
    public void lihatObat () {
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
    
    public void ubahObat () {
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

    public void deleteObat () {
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