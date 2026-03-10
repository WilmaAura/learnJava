package calculator;

import java.util.Scanner;

class Calculator {
    double addition (double num1, double num2) {
        return num1 + num2;
    }
    double subtract (double num1, double num2) {
        return num1 - num2;
    }
    double multiply (double num1, double num2) {
        return num1 * num2;
    }
    double division (double num1, double num2){
        if (num1 == 0){
            System.out.println("Tidak bisa dibagi");
        }
        return num1 / num2;
    }
    double power (double num1, double num2){
        return Math.pow(num1,num2);
    }
    
    double sqrt (double num1){
        return Math.sqrt(num1);
    }

}

class View {
    Calculator calc = new Calculator();
    Scanner sc = new Scanner(System.in);
    void view () {
    System.out.println("--------------------------------");
    System.out.println("        Basic calculator        ");
    System.out.println("--------------------------------");
    System.out.println("Masukkan angka pertama: ");    
    Double = sc.nextDouble();
    System.out.println("Masukkan angka kedua: ");
    calc.num2 = sc.nextDouble();

    System.out.println("\nPilih operasi:");
    System.out.println("1. Tambah");
    System.out.println("2. Kurang");
    System.out.println("3. Kali");
    System.out.println("4. Bagi");
    int pilihan = sc.nextInt();
    switch (pilihan){
        case 1:
            System.out.println("Hasil: " + calc.addition());
            break;
        case 2:
            System.out.println("Hasil: " + calc.subtract());
            break;
        case 3:
            System.out.println("Hasil: " + calc.multiply());
            break;
        case 4:
            System.out.println("Hasil: " + calc.division());
            break;
    }
    }
}

public class Main {
    public static void main (){
        View vi = new View ();
        vi.view();
    }
}

