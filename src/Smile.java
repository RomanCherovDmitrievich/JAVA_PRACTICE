import javax.print.DocFlavor.STRING;
import java.util.ArrayList;
import java.util.Iterator;
// Упражнение 2
class DrawLine
{
    public String line;

    public static void draw(String line)
    {
        System.out.println(line);
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

        Iterator<String> it = smile.iterator();

        while(it.hasNext())
        {
            //l.line = it.next();
            l.draw(it.next());
        }        
    }
}

