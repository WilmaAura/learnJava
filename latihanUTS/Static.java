package latihanUTS;

public class Static {
    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public static void main(String[] args) {
        myStaticMethod();// Call the static method
        Static.myStaticMethod(); //Or call itt using the class name
    }
}
