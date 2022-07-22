     //LIFO working

package Collection.Stack;
     import java.util.Stack;

     public class A {
         public static void main(String[] args) {
             Stack<String> Name = new Stack<>();  //LIFO
             Name.push("Gyan");
             Name.push("Golu");   //push means add
             Name.push("Abhay");
             System.out.println(Name);
             Name.pop();   //pop means remove
             System.out.println(Name);
         }
}
