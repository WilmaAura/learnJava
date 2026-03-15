package mobil;


public class mobilDemo2{
    public static void main (String [] args){
        Mobil2 mobil = new Mobil2();
        mobil.hidupkanMobil();
        mobil.gantiGigi(1);
        mobil.gantiGigi(2);
        mobil.matikanMobil();
    }

}
class Mobil2{
    boolean mesinHidup = false;
    int gigi = 0;
    public void hidupkanMobil(){
        mesinHidup = true;
        System.out.println("Mobil dihidupkan");
    }
    void matikanMobil(){
        mesinHidup = false;
        System.out.println("Mobil dimatikan");
    }
    
    void gantiGigi(int gigiBaru){
        gigi = gigiBaru;
        System.out.println("Ganti gigi: ");
    }
    
}