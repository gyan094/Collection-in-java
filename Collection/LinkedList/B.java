package Collection.LinkedList;
import java.util.LinkedList;

public class B {
    public static void main(String[] args) {
        LinkedList<String> Name = new LinkedList<String>();
        Name.add("Gyan");    //add
        Name.add("Golu");
        Name.add("Abhay");
        System.out.println(Name);
        Name.addFirst("Adarsh");
        System.out.println(Name);
        Name.add(2,"Gaurav");
        System.out.println(Name);
        Name.remove();//bigning index se remove krna
        System.out.println(Name);
        Name.remove(2);  //index woyse
        System.out.println(Name);
        Name.removeLast();
        System.out.println(Name);
    }
}
