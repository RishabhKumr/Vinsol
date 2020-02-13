import java.util.*;
import java.util.Scanner;
public class Sample
{
    List<String> lst;
    Sample()
    {
        lst = new ArrayList<String>();
    }
    public String peek()
    {
        String a =  lst.get(lst.size() - 1);
        return a;
    }  
    public void push(String data)
    {
        lst.add(data);
    }
    public boolean getEmpty()
    {
        if(lst.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String pop() {
         if (!getEmpty()) {
              String getElement  = lst.get(lst.size() - 1);
              lst.remove(lst.size() - 1);             
              return getElement;
         } 
         else
         {
              return null;
         }
    }
    public static void main(String args[])
    {
        Sample s = new Sample();
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
            System.out.println("Check empty stack:-"+s.getEmpty());
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
