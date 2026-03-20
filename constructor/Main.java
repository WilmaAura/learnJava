package constructor;
// Constructor
class Siswa{
    String nama;
    String kelas;
    Siswa(){
        nama = "Belum diisi";
        kelas = "Belum ada";
    }
} 
public class Main{
    public static void main (String[] args){
        Siswa s1 = new Siswa();
        System.out.println("Nama:" + s1.nama);
        System.out.println("Kelas:" + s1.kelas);
    }
}