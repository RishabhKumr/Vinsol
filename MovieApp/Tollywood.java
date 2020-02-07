import java.util.*;
public class Tollywood
{ 
    public String name;
    public String year;
    public String language;
    public String genre;
    public String Rdate;
    public String isBlockBuster;
    public String food = "DOSA";
        public String isHit()
    {
     Random rd = new Random();
     boolean b = rd.nextBoolean();
     String isBlockBuster = String.valueOf(b);
     return isBlockBuster;
    }
    public Tollywood(String n,String y,String lang,String gen,String Rd)
    {
        name  = n;
        year = y;
        language = lang;
        genre = gen;
        Rdate = Rd;
    }
    public String toString()
    {
          Random rd = new Random();
     boolean b = rd.nextBoolean();
     String isBlockBuster = String.valueOf(b);
        return ("Name:-"+name+"\t Free Food:-"+food+"\t isBlockBuster:-"+isBlockBuster+"\n");
    }
    
}