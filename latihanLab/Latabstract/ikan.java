package Latabstract;
//Subclass harus mengikuti superclass
public class ikan extends makhlukHidup{
    @Override
    public void berjalan(){
        System.out.println("Ikan berenang menggunakan sirip");
    }

    @Override
    public void bernafas(){
        System.out.println("Ikan Bernafas dengan insang");
    }

    @Override
    public void makan(){
        System.out.println("Ikan juga makan");
    }
}
