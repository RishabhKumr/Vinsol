import java.util.*;
class Hollywood
{
    public String name;
    public String year;
    public String language;
    public String genre;
    public String Rdate;
    public String isBlockBuster;
    private String food = "Pepper Stack";
    public String isHit()
    {
     Random rd = new Random();
     boolean b = rd.nextBoolean();
     String isBlockBuster = String.valueOf(b);
     return isBlockBuster;
    }
    public String toString()
    {  Random rd = new Random();
        boolean b = rd.nextBoolean();
     String isBlockBuster = String.valueOf(b);
     //return isBlockBuster;
        return "Name:-"+name+"\t Free Food:-"+food+"\t isBlockBuster:-"+isBlockBuster+"\n";
    }
    public Hollywood(String n,String y,String lang,String gen,String Rd)
    {
        name  = n;
        year = y;
        language = lang;
        genre = gen;
        Rdate = Rd;
        ;
    }

}