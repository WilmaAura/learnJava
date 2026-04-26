package latihanUTS;

public class Main {
    int x = 5; //Attributes (Variable inside a class)
    final float pi = 3.14f;
    public static void main(String[] args){
        Main myobj = new Main(); //Object 1
        Main myobj2 = new Main();
        encapsulation obj1 = new encapsulation(); //encapsulation
        obj1.setName("Wilma");
        System.out.println(obj1.getName());
        System.out.println(myobj.x);
        System.out.println("Object 2: " + myobj2.x *5
        );
        myMethod();
    }    

    static void myMethod(){ //used to perform certain actions
        System.out.println("Hai bitch");
    }
}

class Second {
    public static void main (String [] args){
        Main myobj1 = new Main();
        System.out.println(myobj1.x);
        System.out.println(
            "pi:" + myobj1.pi
        );
    }
}

