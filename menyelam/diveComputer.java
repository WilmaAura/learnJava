package menyelam;

public class diveComputer {
    protected double currentDepth =0;
    protected int diveTime=0;

    public double tekananAbsolut(double depth){
        return (depth/10.0) + 1.0;
    }

    public int getNDL(double depth){
        if (depth <= 18) return 60;
        if (depth <= 40) return 9; 
        return 0;
    }
    public void updateDive(diver diver, double newDepth, int minutes){
        this.currentDepth = newDepth;
        this.diveTime += minutes;
        // air used = tank capacity * tekananAbsolut (currentDepth)* minutes
        double airUsed = diver.getTankCapacity() * tekananAbsolut(currentDepth) * minutes;
        diver.setTekananAwal(diver.getTekananAwal() - (airUsed / diver.getTankCapacity()));
    }
    public void checkSafetyAlerts(diver diver){
        System.out.println("\n Checking Alerts!!!");
        if (currentDepth > 40){
            System.out.println("->Warning: You dive too far!!");
        }
    }
}

 class proDiveComputer extends diveComputer{

   @Override
    public void checkSafetyAlerts(diver diver){
        System.out.println("\n Running Advanced Deep-Dive Analytics...");
        super.checkSafetyAlerts(diver);

        if(diver.getTekananAwal() < 50){
            System.out.println("Sisa udara Kritis! Segera naik sekarang");
        }
        if (currentDepth >= 5 && currentDepth <= 6){
            System.out.println("Deteksi dekompresi: Tahan posisi 3 menit.");
        }
    }

}