package CRUD;

import java.sql.PreparedStatement;
import java.sql.Statement; 
import java.sql.ResultSet; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
//import java.util.concurrent.StructuredTaskScope.Joiner;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 

// Satukan deklarasi class, dan perbaiki JFrame (F-nya kapital)
public class formBarang extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs; 
    public PreparedStatement ps;
    Connection conn;
    String user = "root";
    String passw = ""; // Ganti sesuai password MariaDB-mu jika ada
    DefaultTableModel tmodel;
    String url = "jdbc:mariadb://localhost:3306/db_java?zeroDateTimeBehavior=CONVERT_TO_NULL";

    private javax.swing.JTable jTable1 = new javax.swing.JTable();
    private javax.swing.JTextField xkode = new javax.swing.JTextField();
    private javax.swing.JTextField xnama = new javax.swing.JTextField();
    private javax.swing.JTextField xsatuan = new javax.swing.JTextField();
    private javax.swing.JTextField xjumlah = new javax.swing.JTextField();
    private javax.swing.JTextField xharga = new javax.swing.JTextField();

    public formBarang() {
        initComponents();
        tampilBarang();
        aturLebar();
        bukaField(false);
    }

    // Simulasi initComponents standar NetBeans/VS Code GUI
    private void initComponents() {
        // Biasanya berisi layouting tombol dan tabel
    }

    private void bukaField(boolean aksi) {
        xkode.setEnabled(aksi);
        xnama.setEnabled(aksi);
        xsatuan.setEnabled(aksi);
        xjumlah.setEnabled(aksi);
        xharga.setEnabled(aksi);
    }

    void aturLebar() {
        if (jTable1.getColumnCount() >= 5) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(120); // Diperbaiki ke indeks 4
            jTable1.requestFocus();
        }
    }

    void tampilBarang() {
        try {
            conn = DriverManager.getConnection(url, user, passw);
            tmodel = new DefaultTableModel();
            tmodel.addColumn("Kode");
            tmodel.addColumn("Nama Barang");
            tmodel.addColumn("Satuan");
            tmodel.addColumn("Jumlah");
            tmodel.addColumn("Harga");

            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM barang");
            while (rs.next()) {
                tmodel.addRow(new Object[]{
                    rs.getString("kode_brg"),
                    rs.getString("nama_barang"),
                    rs.getString("satuan"),
                    rs.getString("jumlah"),
                    rs.getString("harga")
                });
            }
            jTable1.setModel(tmodel); // Dipindah ke luar while
            aturLebar(); // Dipindah ke sini agar dieksekusi setelah model terpasang
            
        } catch (SQLException ex) {
            Logger.getLogger(formBarang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + ex.getMessage());
        }
    }
    //Simpan data barang
    private void tblSimpanActionPerformed(java.awt.event.ActionEvent evt) { 
        if(xkode.getText().isEmpty() || xnama.getText().isEmpty() || xsatuan.getText().isEmpty() || xjumlah.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pastikan Semua data terisi dengan baik!");
            xkode.requestFocus();
        }
        try{
            //TODO add handling code here
            ps=conn.prepareStatement("insert into barang (kode_brg, nama_barang, satuan, jumlah, harga) values(?,?,?,?,?)");
             ps.setString(1, xkode.getText());             
             ps.setString(2, xnama.getText());             
             ps.setString(3, xsatuan.getText()); 
             ps.setString(4, xjumlah.getText()); 
             ps.setString(5, xharga.getText()); 

             ps.executeUpdate();
             tampilBarang();
        }catch(SQLException ex){
            Logger.getLogger(formBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Tambah Data Barang
    private void tblTambahActionPerformed(java.awt.event.ActionEvent evt){
        bukaField(true);
        xkode.requestFocus();
    }
    //koreksi barang
    private void tblKoreksiActionPerformed(java.awt.event.ActionEvent evt){
        try {
            ps = conn.prepareStatement("update barang set nama_barang=?,satuan=?,jumlah=?,harga=? where kode_brg=?");
            ps.setString(1, xnama.getText());
            ps.setString(2, xsatuan.getText());
            ps.setString(3, xjumlah.getText());
            ps.setString(4, xharga.getText());
            ps.setString(5, xkode.getText());
        }catch(SQLException ex){
            Logger.getLogger(formBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //hapus barang
    private void tblhapusActionPerformed(java.awt.event.ActionEvent evt){
        try {
            int pilihan = JOptionPane.showConfirmDialog(
                null, "Apakah Anda yakin menghapus data ini?",
                "Konfirmasi Penghapusan",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );
            if (pilihan == JOptionPane.YES_OPTION){
                ps=conn.prepareStatement("delete from barang where kode_brg=?");
                ps.setString(1, xkode.getText());
                ps.executeUpdate();
                tampilBarang();
                System.out.println("Data berhasil dihapus.");
            }else{
                System.out.println("Penghapusan dibatalkan");
            }
        } catch(SQLException ex){
            Logger.getLogger(formBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //method keluar
    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt){
        System.exit(0);
    }

    //Saat jTable di click
    private void jTable1MouseClicked(java.awt.event.ActionEvent evt){
        xkode.setText(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        xnama.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
        xsatuan.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
        xjumlah.setText(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
        xharga.setText(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
    }
}

public static void main (String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new formBarang().setVisible(true);
            }
        });
}
