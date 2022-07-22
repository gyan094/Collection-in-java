    //FIFO working
package Collection.ArrayDeque;
import java.util.ArrayDeque;

public class A {
    public static void main(String[] args) {
        ArrayDeque<String> Name = new ArrayDeque<>();  //FIFO
        Name.add("Gyan");    
        Name.add("Golu");
        Name.add("Abhay");
        System.out.println(Name);
        Name.remove();
        System.out.println(Name);
    }
}
