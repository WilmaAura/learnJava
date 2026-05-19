import java.util.Scanner;

public class diveSimulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- DEEP BLUE JAVA SIMULATOR ---");
        System.out.println("Masukkan Nama Penyelam: ");
        String name = sc.nextLine();
        System.out.println("Kapasitas Tabung (Liter, Rekomendasi 12): ");
        double capacity = sc.nextDouble();
        System.out.println("Tekanan Awal Tabung (BAR, Rekomendasi 200):");
        double pressure = sc.nextDouble();
        System.out.println("SAC Rate kamu (Liter/menit, Rata-rata 20):");
        double sac = sc.nextDouble();
        diver penyelam = new diver(name, capacity, pressure, sac);
    }
}