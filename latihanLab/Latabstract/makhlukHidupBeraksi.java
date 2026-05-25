package Latabstract;

public class makhlukHidupBeraksi {
    public static void main(String[] args) {
        makhlukHidup hm= new human();
        makhlukHidup ik= new ikan();
        hm.makan();
        hm.berjalan();
        hm.bernafas();

        ik.berjalan();
        ik.bernafas();
        ik.makan();
    }
}
