
package casting01;

public class Casting01 {
    public static void main(String[] args) {
    //byte x = 128; //! Type mismatch: cannot from int to byte
    short x = 128;
    byte y = (byte)x;    
    System.out.print("short x = " + x + " byte y = " + y + "\n");

    byte z = 127;
    System.out.print("При z = 127, z - " + z + ", при z+1, z - " + ++z + " при ещё одном z+1, z - " + ++z);
    }    
}
