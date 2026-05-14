package matematika;

    class matematika{
        double addition(int var1, int var3) {
            return var1 + var3;
        }

        double subtract(int var1, int var3) {
            return var1 - var3;
        }

        double multiply(int var1, int var3) {
            return var1 * var3;
        }

        double division(int var1, int var3) {
            if (var1 == (int)0.0F) {
                System.out.println("Tidak bisa dibagi");
            }
            return var1/var3;
            }

        /* overloading */
        double addition(double var1,double var2, double var3) {
            return var1 + var2 + var3;
        }

        double subtract(double var1, double var2, double var3) {
            return var1 - var2 - var3;
        }

        double multiply(double var1, double var2, double var3) {
            return var1 * var2  * var3;
        }

        double division(double var1, double var2, double var3) {
            if (var1 == (double)0.0F) {
                System.out.println("Tidak bisa dibagi");
            }
                return var1/var3;
            }
    }
public class matematikaBeraksi {
    public static void main(String[] args) {
        matematika m = new matematika();
         System.out.println(m.addition(12.5, 28.7, 14.2));
    }    
}
