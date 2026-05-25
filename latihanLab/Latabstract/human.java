package Latabstract;

public class human extends makhlukHidup {
    @Override
    public void berjalan(){
        System.out.println("Manusia berjalan dengan dua kaki");
    }
    @Override
    public void bernafas(){
        System.out.println("Manusia bernafas dengan paru-paru");
    }

    @Override
    public void makan(){
        System.out.println("Manusia makan dengan tangan");
    }
}
