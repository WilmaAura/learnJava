package constructor;

class Karyawan{
    String nama;
    int gaji;
    Karyawan(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    void tampil(){
        System.out.println("Nama:" + nama);
        System.out.println("Gaji:" + gaji);
    }
}

public class karyawan{
    public static void main (String[] args){
        Karyawan k1 = new Karyawan("Budi", 5000000);
        Karyawan k2 = new Karyawan("Sari", 4500000);
        k1.tampil();
        k2.tampil();
    }
}