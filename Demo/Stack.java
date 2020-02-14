import java.util.*;
import java.util.Scanner;
public class Stack<T>
{
    List<T> lst;
    Stack()
    {
        lst = new ArrayList<T>();
    }
    public T peek()
    {
        return  lst.get(lst.size() - 1);
    }  
    public void push(T data)
    {
        lst.add(data);
    }
    public boolean isEmpty()
    {
       return lst.isEmpty();
    }
    public T  pop() {
	 T value = null;
	 return  value = (!isEmpty())?lst.get(lst.size()-1):null;
    }
}

