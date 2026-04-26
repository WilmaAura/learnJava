package latihanUTS;

public class privateVSpublic {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age); //it will be an error
    }    
}

class Person {
    public String name = "John";
    private int age = 30;
}

