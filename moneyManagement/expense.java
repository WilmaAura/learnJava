package moneyManagement;

import java.time.LocalDate;

class Expense {
    private int id;
    private String nBarang;
    private String jBarang; // Primer, Sekunder, Tersier
    private double amount;
    private LocalDate tgl;

    public Expense(int id, String nBarang, String jBarang, double amount, LocalDate tgl) {
        this.id = id;
        this.nBarang = nBarang;
        this.jBarang = jBarang;
        this.amount = amount;
        this.tgl = tgl;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate gettgl() {
        return tgl;
    }

    public String toString() {
        return id + " | " + nBarang + " | " + jBarang + " | " + amount + " | " + tgl;
    }
}


