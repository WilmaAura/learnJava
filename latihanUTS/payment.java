package latihanUTS;

// Abstract class: The general "blueprint"
abstract class paymentAbstract {
    double amount;
    paymentAbstract(double amount){
        this.amount = amount;
    }
    void printReceipt(){
        System.out.println("Payment processed: Rp" + amount);
    }

    //We know every payment must process, but we don't know how yet.
    abstract void processPayment();
}

class QRISPayment extends paymentAbstract{
    QRISPayment(double amount){
        super(amount); //call constructor to menyimpan data
    }
    @Override //untuk menimpa method yang ada di abstract paymentw
    void processPayment(){
        System.out.println("generating QR Code for Rp " + amount);
        System.out.println("Scanning... Success!");
    }
}

class BankTransfer extends paymentAbstract {
    BankTransfer(double amount){
        super(amount);
    }
    void processPayment(){
        System.out.println("Creating Virtual Account number...");
        System.out.println("Transfer received via Bank Central!");
    }
}

public class payment{
    public static void main(String[] args) {
    paymentAbstract qris = new QRISPayment(50000);
    qris.processPayment();
    qris.printReceipt();
    }
}