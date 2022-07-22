package Collection.ArraryList;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Gyan");    //add
        Name.add("Abhay");
        Name.add("Gaurav");
        System.out.println(Name);
        Name.add("Navneet");
        System.out.println(Name);
        Name.add(2,"Adarsh");//directly 2 inex
        System.out.println(Name);
        Name.add(0,"Golu");
        System.out.println(Name);
        Name.remove(3);    //Remove 3 index value
        System.out.println(Name);
        Name.set(2,"Anup");        //value replace
        System.out.println(Name);
        System.out.println(Name.get(1));  //onliy one value printed
         Name.clear();   //all array element is deleted
        System.out.println(Name);
    }
}
