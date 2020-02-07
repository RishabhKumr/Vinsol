
import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class Movie
{ 
    public String name;
    public String year;
    public String language;
    public String genre;
    public String Rdate;
    public String isBlockBuster;
    Movie(String n,String y,String lang,String gen,String Rd)
    {
        name = n;
        year = y;
        lang = lang;
        genre = gen;
        Rdate = Rd;
    }
    public String toString()
    {
        return ("Name of Movie:-"+name+"\tYear:-"+year+"\tLanguage:-"+language+"\tGenre:-"+genre+"\tRelease Date:-"+Rdate+"\n");
    }
    public static void main(String args[])
    {
     
     Scanner stc = new Scanner(System.in);
     System.out.println("-----Menu-----");
     System.out.println("(1) Press for Tollywood");
     System.out.println("(2) Press for Bollywood");
     System.out.println("(3) Press for Hollywood");
     System.out.println("(4) Press for All Movies");
     int option = stc.nextInt();
     //LinkedList<Movie> list = new LinkedList<Movie>();
     LinkedList<Tollywood> listtw = new LinkedList<Tollywood>();
     LinkedList<Bollywood> listbw = new LinkedList<Bollywood>();
     LinkedList<Hollywood> listhw = new LinkedList<Hollywood>();
     //Scanner sc = new Scanner(System.in);

   //  String n = sc.nextLine();
   //  String y = sc.nextLine();
   //  String lang= sc.nextLine()
   //  String gen= sc.nextLine();
   //  String Rd = sc.nextLine();
     Tollywood mv1 = new Tollywood("bvjhds","dfn","dfjh","cvdj","sjb");
     Bollywood mv2 = new Bollywood("bvjfwf","dfn","dfjh","cvdj","sjb");
     Hollywood mv3 = new Hollywood("bvjhds","dfn","dfjh","cvdj","sjb");
     Tollywood tw = new Tollywood("bvjhds","dfn","dfjh","cvdj","dhbf");
     Bollywood bw = new Bollywood("bvjhds","dfn","dfjh","cvdj","dhbf");
     Hollywood hw = new Hollywood("bvjhds","dfn","dfjh","cvdj","dhbf");
     listtw.add(mv1);
     listbw.add(mv2);
     listhw.add(mv3);
     listtw.add(tw);
     listbw.add(bw);
     listhw.add(hw);

     switch(option)
     {
         case 1:
         System.out.println("-----Tollywood Movies-----");
         System.out.println(listhw);
         break;
         case 2:
         System.out.println("-----Bollywood Movies-----");
         System.out.println(listbw);
         break;
         case 3:
         System.out.println("-----Hollywood Movies-----");
         System.out.println(listhw);
         break;
         case 4:
         System.out.println("-----All Movies-----");
          System.out.println(listhw);
          System.out.println(listbw);
          System.out.println(listtw);
         
    }
}
}