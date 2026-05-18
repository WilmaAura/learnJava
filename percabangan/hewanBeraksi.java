package percabangan;

class hewan {
    void suaraHewan(){
        System.out.println("Semua punya suara");
    }
}

class kucing extends hewan {
    @Override
    void suaraHewan(){
        System.out.println("Kucing meong");
    }
}

class anjing extends hewan{
    @Override
    void suaraHewan(){
        System.out.println("Anjing guk guk");
    }
}

class kambing extends hewan{
    @Override
    void suaraHewan(){
        System.out.println("MBEKKKKK");
    }
}

//gerakan dari robot menggunakan polymorphism
public class hewanBeraksi{
    public static void main(String[] args) {
        hewan h1= new kucing();
        hewan h2= new anjing();
        hewan h3= new kambing();
        h1.suaraHewan();
        h2.suaraHewan();
        h3.suaraHewan();
        hewan [] hw ={new kambing(), new anjing(), new kucing()};
        System.out.println("--------------------");
        for (hewan h:hw){
            h.suaraHewan();
        }
    }
}