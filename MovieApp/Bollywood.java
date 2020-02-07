import java.util.*;
class Bollywood
{
    public String name;
    public String year;
    public String language;
    public String genre;
    public String Rdate;
    public String isBlockBuster;
    private String food = "Dal makhni";
    public String isHit()
    {
     Random rd = new Random();
     boolean b = rd.nextBoolean();
     String isBlockBuster = String.valueOf(b);
     return isBlockBuster;
    }

    public Bollywood(String n,String y,String lang,String gen,String Rd)
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
        return ("Name:-"+name+"\tFree food:-"+food+"\t isBlockbuster:-"+isBlockBuster+"\n");
    }
}