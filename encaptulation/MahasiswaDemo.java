package encaptulation;

class Mahasiswa{
    private int nim;
    private String nama;
    private float IPK;
    public Mahasiswa(int nim, String nama, float IPK){
        this.nim = nim;
        this.nama = nama;
        this.IPK = IPK;
    }
    public int getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public float getIPK(){
        return IPK;
    }
}

public class MahasiswaDemo{
    public static void main(String[] args){
        Mahasiswa mhs= new Mahasiswa(11, "Wilma", 3.73f); 
        System.out.println("Nim :" + mhs.getNim());
        System.out.println("Nama :" + mhs.getNama());
        System.out.println("IPK: " + mhs.getIPK());
    }
}

