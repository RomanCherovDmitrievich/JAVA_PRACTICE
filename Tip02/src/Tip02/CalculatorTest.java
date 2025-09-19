package Tip02;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class CalculatorTest {
    public static void main(String[] args) { 
        Calculator cl = new Calculator();
        Vector<Double> person = new Vector<>();
        Collections.addAll(person, 10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0);

        ListIterator<Double> iter = person.listIterator();

        int n = 1;
        while (iter.hasNext()) {
            System.out.printf("Гость " + n + " должен заплатить:");
            Double person_price = iter.next();
            System.out.printf("%.1f$\n ", cl.findTotal(person_price));
            ++n;
        }
        
        
    }
}
