package calc;

import java.util.Scanner;

class calculator {
    double tambah (double num1, double num2){
        return num1 + num2;
    }
    double kurang (double num1, double num2){
        return num1 - num2;
    }
    double bagi (double num1, double num2){
        return num1 / num2;
    }
    double kali (double num1, double num2){
        return num1 * num2;
    }
    double pangkat (double num1, double num2){
        return Math.pow(num1,num2);
    }
    double sqrt (double num1){
        if (num1 < 0){
            System.out.println("Tidak bisa diakar karena min!!");
        }
        return Math.sqrt(num1);
    }
}

class view {
    calculator calc = new calculator();
    Scanner sc = new Scanner(System.in);
    void View () {
        System.out.println("------------------------------------");
        System.out.println("        Kalkulator Sederhana        ");
        System.out.println("------------------------------------");
        System.out.println("Masukkan angka pertama: ");
        double a = sc.nextDouble(); //untuk menampung angka pertama
        while (true){
            System.out.println("------------------------------");
            System.out.println("Pilih Operasi: ");    
            System.out.println("1. Tambah");    
            System.out.println("2. Kurang");    
            System.out.println("3. Kali");    
            System.out.println("4. Bagi");    
            System.out.println("5. Pangkat");    
            System.out.println("6. Sqrt");    
            System.out.println("7. Hasil akhir");
            System.out.println("------------------------------");
            System.out.println("Pilih Operasi:");
            int pilihan = sc.nextInt();
            
            if (pilihan == 7){
                System.out.println("Hasil akhir: " + a);
                break;
            }
            if (pilihan == 6){
                System.out.println("Hasil Sementara: " + a);
                continue;
            }
            System.out.println("Masukkan angka kedua: ");
            double b = sc.nextDouble();
            switch (pilihan){
                case 1: 
                    a = calc.tambah(a,b);
                    break;
                case 2: 
                    a = calc.kurang(a,b);
                    break;
                case 3: 
                    a = calc.kali(a,b);
                    break;
                case 4: 
                    a = calc.bagi(a,b);
                    break;
                case 5: 
                    a = calc.pangkat(a,b);
                    break;
                default:
                    System.out.println("Tidak memenuhi pilihan yang ada!!");
            }
            System.out.println("Hasil Sementara:" + a);
        }
    }
}

public class main {
    public void Main(String[] args){
        view vi = new view();
        vi.View();
    }
}