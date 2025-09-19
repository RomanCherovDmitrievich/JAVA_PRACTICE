package tip03;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;
    // * Использую перегрузку
    public void findTotal(double price, String name){
        double total = price*(1+tax+tip);
        System.out.printf(name + " должен %.1f$\n", total);
    }
    public void findTotal(double price){
        double total = price*(1+tax+tip);
        System.out.printf("Должен %.1f$\n", total);
    }
}