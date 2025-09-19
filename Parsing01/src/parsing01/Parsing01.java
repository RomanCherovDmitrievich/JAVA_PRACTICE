package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        String shirtPrice = "15";
        String taxRate = "0,05";
        String gibberish = "887ds7nds87dsfs";

        System.out.print(shirtPrice * taxRate); // 
        
        int x = 0;
        int x1 = x + shirtPrice;
        int x2 = x + taxRate;
        int x3 = x + gibberish;
    }
    
}
