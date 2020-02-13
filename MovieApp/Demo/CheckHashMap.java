import java.util.*;
public class CheckHashMap
{
    Map<Integer,Integer> m;
    CheckHashMap()
    {
        m = new HashMap<Integer,Integer>();
    }
    void push(int key,int value)
    {
        m.put(key,value);
    }
    void print()
    {
        Iterator<Map.Entry<Integer,Integer>> itr = m.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> entry = itr.next();
            System.out.println("Key:-"+entry.getKey()+"Value:-"+entry.getValue());
        }
    }
    boolean checkKey(int key)
    {
        if(m.containsKey(key))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int getValue(int key)
    {
        return m.get(key);
    }
    public static void main(String args[])
    {
        CheckHashMap hm = new CheckHashMap();
        hm.push(1,100);
        hm.push(2,200);
        hm.push(3,300);
        hm.push(2,100);
        hm.print();
        boolean b = hm.checkKey(1);
        System.out.println(b);
        int a = hm.getValue(2);
        System.out.println(a);
    }
}