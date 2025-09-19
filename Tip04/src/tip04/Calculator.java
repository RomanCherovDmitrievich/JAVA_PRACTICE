package tip04;

import java.util.Vector;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;
    private int i = 0;
    private double total = 0;
    public int n = 1;
    private Vector<String> person_name = new Vector<>();
    
    public void findTotal(double price, String name){
        total += price*(1+tax+tip);
        person_name.add(name);
        if(i != 7)
        {
            i++;
            return;
        }

        System.out.printf("Общая сумма вышла - %.1f$\n", total);
        for(int i = 0; i < person_name.size(); i++)
        {
            String str = person_name.get(i);
            if(str != null)
            {
                System.out.printf(str + " ничего не должен \n");
            }
            else{
                System.out.printf( "Гость " + n + " должен %.1f$\n", total/6);
            }
            n++;
        }
    }
}
