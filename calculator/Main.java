package calculator;

import java.util.Scanner;

class Calculator {
    double num1;
    double num2;

    double addition () {
        return num1 + num2;
    }
    double subtract () {
        return num1 - num2;
    }
    double multiply () {
        return num1 * num2;
    }
    double division (){
        if (num1 == 0){
            System.out.println("Tidak bisa dibagi");
        }
        return num1 / num2;
    }
    double power (){
        return num1 * num2;
    }

}

class View {
    Calculator calc = new Calculator();
    Scanner sc = new Scanner(System.in);
    void view () {
    System.out.println("--------------------------------");
    System.out.println("        Basic calculator        ");
    System.out.println("--------------------------------");
    }
}
public class Main {
    public static void main (){
        View vi = new View ();
        vi.view();
    }
}

