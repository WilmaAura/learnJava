package latihanUTS;
    //inherit attributes and method from one class to another.
public class inheritance {
    
}
class Vehicle {
    protected String brand = "Ford"; //vehicle attribute
    public void honk(){
        System.out.println("PERGI KAU SUKI");
    }
}

class carCok extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        carCok mycar = new carCok();
        mycar.honk();
        System.out.println(mycar.brand+ " " + mycar.modelName);
    }
}
