package latihanUTS;
// an abstract is a blueprints of a blueprint. tapi kita tidak tau apa yang akan dilakukan oleh class lain.
abstract class learnAbstract {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

class Student extends learnAbstract{
    public int graduationYear = 2018;
    public void study (){
        System.out.println("Studying all day long");
    }
}

class SecondCok {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Name: " + obj.fname);
        System.out.println("Age: " + obj.age);
        System.out.println("Graduation Year: " + obj.graduationYear);
        obj.study(); //call abstract method
    }
}
