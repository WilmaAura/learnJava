package robot;

public class kaki extends robot {
    tangan t = new tangan();
    boolean jalan = true;
    @Override
    void bergerak(String kaki){
        if (kaki == "Kanan"){
            System.out.println("Kaki kanan maju");
            t.bergerak("kiri");
        }else{
            System.out.println("Kaki kiri maju");
            t.bergerak("kanan");
        }
    }
}
