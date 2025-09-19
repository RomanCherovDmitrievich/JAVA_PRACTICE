package tip03;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class CalculatorTest {
    public static void main(String[] args) {
        
       Calculator calc = new Calculator();
       
       Vector<Double> person = new Vector<>();
        Collections.addAll(person, 10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0);
        String name = "Alex";

        ListIterator<Double> iter = person.listIterator();

        int n = 1;
        while (iter.hasNext()) {
            System.out.printf("Гость " + n + " должен заплатить:");
            Double person_price = iter.next();
            if(n != 6)
            {
                calc.findTotal(person_price);
            }
            else{
                calc.findTotal(person_price, name);
            }

            ++n;
        }
        // todo:  если мне не известно кому принадлежит имя(номер гостя), я бы сделал массив который хранит
        //todo/   2 значения(цену и имя), если там null(нет имени), то if ищет есть ли имя у данного гостя
    }    
}
