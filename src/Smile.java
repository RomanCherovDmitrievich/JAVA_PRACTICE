import javax.print.DocFlavor.STRING;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


// Упражнение 2
class DrawLine
{
    public String line;
    public static void draw(String line)
    {
        System.out.println(line);
    }
    public static void error_draw()
    {
        System.out.println("Error");
    }
}

public class Smile {
    public static void main(String[] args) {
        
        ArrayList<String> smile = new ArrayList<>();
        DrawLine l = new DrawLine();


        smile.add("  ####  ");
        smile.add(" #    # "); 
        smile.add("# #  # #");
        smile.add("#      #");
        smile.add("# #  # #");
        smile.add("#  ##  #");
        smile.add(" #    # ");
        smile.add("  ####  ");

        l.draw("  ####   ");

        Iterator<String> it = smile.iterator();

        while(it.hasNext())
        {
            l.draw(it.next());
            l.error_draw();
        }        
        smile.clear();
    }
}

