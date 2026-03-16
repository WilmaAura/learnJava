package encaptulation;

class Mahasiswa{
    private int nim;
    private String nama;
    public Mahasiswa(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    public int getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
}

public class MahasiswaDemo{
    public static void main(String[] args){
        Mahasiswa mhs=new Mahasiswa(11, "Wilma"); 
        System.out.println("Nim :" + mhs.getNim());
        System.out.println("Nama :" + mhs.getNama());
    }
}

