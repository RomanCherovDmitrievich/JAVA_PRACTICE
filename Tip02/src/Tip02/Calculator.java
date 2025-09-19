package Tip02;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public double findTotal(double personal_price){
        double totalPrice = personal_price + personal_price * tax + personal_price * tip;
        return totalPrice;
    }
}
