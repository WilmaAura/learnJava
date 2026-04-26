package latihanUTS;
/* The this keyword is often used to avoid confusion 
when class attributes have the same name as method or constructor paramaters.
*/

public class This {
    int x; //class attribute
    public This(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        This obj = new This(5);
        System.out.println("Value of x = " + obj.x);
    }
}
