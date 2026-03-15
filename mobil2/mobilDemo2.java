package mobil2;

class Mobil{
    int gigi = 0;
    void nyalakanMobil(){
        System.out.println("Mobil Menyala!!");
    }
    void gantiGigi(int gantiGigi){
        gigi = gantiGigi;
        System.out.println("Ganti gigi:" + gigi);
    }
    void matikanMobil(){
        System.out.println("Mobil Mati!!");
    }
}
public class mobilDemo2{
    public void Main (String[] args) {
        Mobil mobil2 = new Mobil();
        mobil2.nyalakanMobil();
        mobil2.gantiGigi(1);
        mobil2.gantiGigi(2);
        mobil2.matikanMobil();
    }
}