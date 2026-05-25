package abstractNInterface;

abstract class Telepon {
    protected long nomer;
    public void telpon(){
        System.out.println("Sedang Menelepon");
    }
}

class Handphone extends Telepon implements kamera, Radio{
    private String gelombang;
    private float pixel;
    public void ambilGambar(){
        System.out.println("Gambar terambil...");
    }
    public void setGelombang(String gel){
        this.gelombang=gel;
    }
    public void setPixel(float pixel){
        this.pixel=pixel;
    }
    public void setNomor (long no){
        this.nomer = no;
    }
}
