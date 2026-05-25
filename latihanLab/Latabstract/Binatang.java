package Latabstract;

public abstract class Binatang {
    abstract void makan();
    abstract void tidur();
    void mati(){
        System.out.println("Mati.......");
    }
}

class Harimau extends Binatang{
    void makan (){
        System.out.println("Harimau makan");
    }
    void tidur (){
        System.out.println("Harimau tidur");
    }

}
class Bebek extends Binatang{
    void makan(){
        System.out.println("Bebek makan");
    }
    void tidur (){
        System.out.println("Bebek Tidur");
    }
}
