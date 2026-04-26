package latihanUTS;

public class constructors {
    int x;
    int modelYear;
    String modelName;
    public constructors(){
        x = 5;
    }
    public constructors(int y){
        x = y;
    }
    public constructors(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        constructors obj = new constructors();
        System.out.println(obj.x);

        constructors mycar = new constructors(1969, "Mustang");
        System.out.println(mycar.modelYear + " " + mycar.modelName);
    }
}
