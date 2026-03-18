package keywordStatic;
class test{
    public int counter = 0;
    public test(){
        counter += 1;
    }
    public int getCounter(){
        return counter;
    }
    public void addCounter(){
        counter += 1;
    }
}

public class testDemo{
    public static void main(String[] args){
    test obj1 = new test();
    test obj2 = new test();
    test obj3 = new test();
    obj1.addCounter();
    System.out.println("Counter milik obj1: " + obj1.getCounter());
    System.out.println("Counter milik obj2: " + obj2.getCounter());
    System.out.println("Counter milik obj3: " + obj3.getCounter());

    }
}