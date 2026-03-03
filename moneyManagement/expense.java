package moneyManagement;

import java.time.LocalDate;

public class expense {
    private int id;
    private String nBarang;
    private String jBarang;
    private double amount;
    private LocalDate tgl;

    public Expense(int id, String nbarang, String jBarang,  double amount, LocalDate tgl){
        this.id = id;
        this.nBarang = nBarang;
        this.jBarang = jBarang;
        this.amount = amount;
        this.tgl = tgl;
    }
public double getAsmount(){
    return amount;
}
public LocalDate getTgl(){
    return tgl;
}
public String toString (){
    return id + " | " + nBarang + " | " + jBarang + " | " + amount + " | " + tgl;
}

}


