import java.util.*;
import java.util.Scanner;
public class SampleQueue
{
    List<String> lst;
    int count = 0;
    SampleQueue()
    {
        lst = new ArrayList<String>();
    }
    public void peek()
    {
        String a =  lst.get(lst.size() - 1);
        System.out.println(a);
    }  
    public void push(String data)
    {
        lst.add(data);
        count++;
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
              String getElement  = lst.get(lst.size() - count);
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
        SampleQueue s = new SampleQueue();
        s.push("Hello");
        s.push("World");
        s.push("symple");
        s.push("example");
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
            s.peek();
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