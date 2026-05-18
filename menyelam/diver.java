package menyelam;

// Memasukkan data profil awal
public class diver {
    private String name;
    private double tankCapacity; //Kapasitas tabung dalam Liter
    private double tekananAwal; //BAR
    private double sacRate; //SAC RATE

    public diver(String name, double tankCapacity, double tekananAwal, double sacRate ){
        this.name = name;
        this.tankCapacity= tankCapacity;
        this.tekananAwal = tekananAwal;
        this.sacRate = sacRate;
    }

    //Setter dan getter
    public String getName(){
        return name;
    }
    public double getTankCapacity(){
        return tankCapacity;
    }
    public double getTekananAwal(){
        return tekananAwal;
    }public double getSacRate(){
        return sacRate;
    }

    // 
    public void setTekananAwal(double pressure){
        this.tekananAwal = pressure;
    }

    public double getAirVolume(){
        return this.tankCapacity * this.tekananAwal;
    }
}
