package tutorial1;

public class Main {
    public static void main(String[] args) /* args stands for arguments. its for array of strings */ 
    throws Exception {
        String name = "Wilma";
        System.out.println("hello " + name);
        System.out.println("RORRRR");
        System.out.println(3);
        System.out.println(3+5);

        chal1(args);
        var(args);
    }

    public static void chal1(String[] args) throws Exception{
        System.out.println("\nWilma Auraruna Khalif");
        System.out.println("Age: " + 20);
        int age= 30;
      
    }
    public static void var(String[] args) {
         System.out.println("My life expectancy is " + age);
         float pi = 3.1415926535f;
         System.out.println("11 pi numbers: " + pi);
         char myLette = 'L';
         boolean mybool = true;
    }
}


