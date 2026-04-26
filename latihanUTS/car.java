package latihanUTS;

public class car {
    public void fullThrottle(){
        System.out.println("The car is going really fast");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) {
        car myCar = new car();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
