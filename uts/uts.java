package uts;
import java.util.Scanner;
public class uts {
    public static void main(String[] args) {
        nasabah newNasabah = new nasabah("Iwa Hermawan", 0);
        Scanner s = new Scanner(System.in);
        boolean menu = true;
        while (menu){
            System.out.println("--MENU ATM--");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Data Nasabah");
            System.out.println("5. Keluar");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Saldo anda sekarang: " + newNasabah.getSaldo());
                    break;
                case 2:
                    double tarik = s.nextDouble();
                    System.out.println("Berapa saldo yang ingin anda tarik?: Rp" + tarik);
                    newNasabah.tarikTunai(tarik);
                    break;
                case 3:
                    double setor = s.nextDouble();
                    newNasabah.setorTunai(setor);
                    System.out.println("Setoran anda sebesar:" + setor);
                default:
                case 4:
                    System.out.println("Nama Nasabah: " + newNasabah.getNama());
                    System.out.println("Saldo Nasabah: " + newNasabah.getSaldo());
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    menu = false;
                    break;
            } 
        }
        s.close();
    }
}

class nasabah{
    private String nama;
    private int saldo;
    nasabah (String nama, int saldo){
        this.nama = nama;
        this.saldo = saldo;
    }
    public String getNama() {
        return nama;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setorTunai(double jumlah){
        if (jumlah >0){
            this.saldo += jumlah;
            System.out.println("Setor tunai berhasil: Rp" + jumlah);
        }
    }
    public void tarikTunai(double jumlah){
        if(jumlah > saldo){
            System.out.println("tidak bisa karena melebihi saldo");
            
        }else{
            this.saldo -= jumlah;
            System.out.println("Tarik tunai berhasil: Rp" + jumlah);
        }
    }
}
