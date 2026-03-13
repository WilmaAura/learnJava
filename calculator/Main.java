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
        if (num1 < 0){
            System.out.println("Tidak bisa diakarkan");
            return num1;
        }
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
        Double a= sc.nextDouble();
    
        while(true){
            System.out.println("\nPilih operasi:");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Pangkat");
            System.out.println("6. Square root");
            System.out.println("7. Hasil akhir");

            int pilihan = sc.nextInt();
            
            if (pilihan == 7){
                System.out.println("Hasil akhir: " + a);
                break;
            }
            if (pilihan == 6){
                a = calc.sqrt(a);
                System.out.println("Hasil sementara/akhir: " + a);
                continue;
            }
            System.out.println("Masukkan angka kedua:");
            double b = sc.nextDouble();
            switch (pilihan){
                case 1:
                     a =  calc.addition(a,b);
                    break;
                case 2:
                     a =  calc.subtract(a,b);
                    break;
                case 3:
                    a =  calc.multiply(a,b);
                    break;
                case 4:
                    a =  calc.division(a,b);
                    break;
                default:
                    System.out.println("Operasi tidak valid");
                }    
            System.out.println("Hasil sementera: " + a);
            }   
    }
}
public class Main {
        public static void main (String[] arg){
            View vi = new View ();
            vi.view();
        }
    }