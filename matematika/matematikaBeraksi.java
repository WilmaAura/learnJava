package matematika;

    class matematika {
        public int tambah (int a, int b){
            return a + b;
        }
        public int kurang (int a, int b){
            return a - b;
        }public int bagi (int a, int b){
            return a / b;
        }public int kali (int a, int b){
            return a * b;
        }
        //Overloading
        public double tambah(double a, double b, double c){
            return a + b + c;
        }
        public double kurang(double a, double b, double c){
            return a - b - c;
        }public double bagi(double a, double b, double c){
            return a / b / c;
        }public double kali(double a, double b, double c){
            return a * b * c;
        }
    }

public class matematikaBeraksi {
    public static void main(String[] args) {
        matematika m = new matematika();
        System.out.println(m.tambah(5, 10));
        System.out.println("---------------");
        System.out.println(m.tambah(12.5, 28.7, 14.2));
        System.out.println("---------------");
        System.out.println(m.kurang(5.1, 1.1, 1.2));
    }    
}
