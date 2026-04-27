package latihanUTS.payrollSystem;
class employee{
    protected String name;
    protected double baseSalary;

    public employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateBonus(){
        return baseSalary * 0.10;
    }
    public String getName(){
        return name;
    }
}
class lecturer extends employee{
    private boolean hasDoctorate;
    public lecturer(String name, double baseSalary, boolean hasDoctorate){
        super(name, baseSalary);
        this.hasDoctorate = hasDoctorate;
    }
    @Override
    public double calculateBonus(){
        double bonus = baseSalary * 0.2;
        if (hasDoctorate){
            bonus += 500000;
        }
        return bonus;
    }
}
class adminStaff extends employee {
    public adminStaff(String name, double baseSalary){
        super(name, baseSalary);
    }
    @Override
    public double calculateBonus(){
        return 300000;
    }
}
public class Main {
    public static void main(String[] args) {
        employee [] staffList ={
            new lecturer("Dr. Aris", 10000000, true), 
            new lecturer("Budi, M.T", 8000000, false), 
            new adminStaff("Citra", 500000),
            new adminStaff("Dodi", 600000) 
        };

        System.out.println("-- University Payroll Report --");
        for (employee e : staffList){
            System.out.printf("Name: %-12s | Bonus: Rp%,.2f%n", e.getName(), e.calculateBonus());
        }
    }
}
