package latihanUTS.bankAccount;

class bankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    bankAccount(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }



    bankAccount(String accountNumber, String ownerName){
        this(accountNumber, ownerName,0.0);
    }

    public void deposit (double amount){
        if (amount > 0){
            this.balance += amount;
        }
    }

    //overload
    public void deposit (int amount){
        deposit((double) amount);
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= this.balance){
            this.balance -= amount;
        }
    }
    //getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }

}

public class Main {
    public static void main(String[] args) {
    bankAccount acc1 = new bankAccount("BNK-001", "Alice", 500.0);    
    System.out.println("Account 1 createdL: " + acc1.getOwnerName() + " | Balance: $" + acc1.getBalance());
    
    // Demonstrate Constructor 2 (Default balance)
    bankAccount acc2 = new bankAccount("BNK-002", "Bob");
    System.out.println("Account 1 createdL: " + acc2.getOwnerName() + " | Balance: $" + acc2.getBalance());

    // Demonstrate Overloaded Deposit (double)
        acc1.deposit(150.50);
        System.out.println("Alice deposited 150.50. New Balance: $" + acc1.getBalance());

        // Demonstrate Overloaded Deposit (int)
        acc2.deposit(100);
        System.out.println("Bob deposited 100 (int). New Balance: $" + acc2.getBalance());

        // Demonstrate Withdrawal (Success)
        acc1.withdraw(50.0);
        System.out.println("Alice withdrew 50.0. New Balance: $" + acc1.getBalance());

        // Demonstrate Withdrawal (Silent Failure)
        acc2.withdraw(500.0); 
        System.out.println("Bob tried to withdraw 500 (Insufficient). Balance remains: $" + acc2.getBalance());
    }
}
