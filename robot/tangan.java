package robot;

public class tangan extends robot {
    @Override
    void bergerak(String tangan){
        if (tangan == "kanan") {
            System.out.println("Tangan kanan maju");
        }else{
            System.out.println("Tangan Kiri maju");
        }
    }
}
