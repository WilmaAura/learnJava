package latihanUTS;
/* Use this() to call another constructor in the same class
This method is useful if you want to provide default values 
or reuse initialization code instead of repeating it.
*/
public class thisConstructor {
    int modelYear;
    String modelName;
    public thisConstructor(String modelName){ //for corvette car
        this(2020,modelName);
    }
    public thisConstructor(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo(){
        System.out.println(modelYear+ " " + modelName);
    }
    public static void main(String[] args) {
        thisConstructor car1 = new thisConstructor("Corvette");
        thisConstructor car2 = new thisConstructor(1969, "Mustang");
        car1.printInfo();
        car2.printInfo();
    }
}
