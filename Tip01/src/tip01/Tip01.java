package tip01;
import java.util.*;


public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        Vector<Double> person = new Vector<>();

        Collections.addAll(person, 10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0);

        ListIterator<Double>  iter = person.listIterator();

        int n = 1;
        while(iter.hasNext())
        {
            Double number_iter = iter.next();
            number_iter += number_iter * 0.05 + number_iter * 0.15;
            System.out.println("Гость " + n + ": " + number_iter + "$");
            n++;
        }
        
    }    
}
