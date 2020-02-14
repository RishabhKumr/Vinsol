import java.util.*;
import java.util.Scanner;
public class Stack
{
    List<String> lst;
    Stack()
    {
        lst = new ArrayList<String>();
    }
    public String peek()
    {
        return  lst.get(lst.size() - 1);
    }  
    public void push(String data)
    {
        lst.add(data);
    }
    public boolean isEmpty()
    {
       return lst.isEmpty();
    }
    public String pop() {
         if (!isEmpty()) {
              String value  = lst.get(lst.size() - 1);
              lst.remove(lst.size() - 1);             
              return value;
         } 
         else
         {
              return null;
         }
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push("Hello");
        s.push("World");
        System.out.println("Enter your choice");
        System.out.println("--------Menu--------");
        System.out.println("(1)peek");
        System.out.println("(2)Pop");
        System.out.println("(3)Check Empty");
        System.out.println("(4)Push");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch(option)
        {
            case 1:
            System.out.println("Peeking first element:-");
            String st  =  s.peek();
	    System.out.print(st);
            break;
            case 2: 
            System.out.println("Poping first element:-"+s.pop());
            
            break;
            case 3:
            System.out.println("Check empty stack:-"+s.isEmpty());
            break;
            case 4:
            Scanner sc1  = new Scanner(System.in);
            String data = sc1.nextLine();
            s.push(data);
            System.out.print("Added to stack!\t"+data+"\t");
            System.out.println(s);
            break;
        
    }
  }
}
