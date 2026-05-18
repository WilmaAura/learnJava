package robot;
import java.util.Scanner;

public class robot {
    void nyalakan (boolean nyala){
        if (nyala == true){
            System.out.println("Robot Menyala");
        }else {
            System.out.println("Robot Mati");
        }
    }
    void bergerak(String jalan){
        if (jalan == "Jalan") {
            System.out.println("Jalankan Robot");
        }else{
            System.out.println("Hentikan Robot");
        }
    }
    public static void main(String[] args) {
        robot r = new robot();
        kaki k = new kaki();
        System.out.println();
        r.nyalakan(true);
        r.bergerak("Jalan");
        for(int i=0; i < 5; i++){
            System.out.println("-------");
            k.bergerak("kanan");
            System.out.println("-------");
            k.bergerak("kiri");
            System.out.println("Robot bergerak sepanjang " + i + " petak");
        }
        r.nyalakan(false);
    }    
}
