import java.util.*;
class MovieApp
{   
    foodType fd;
    LinkedList<Movie> li = new LinkedList<Movie>();
    LinkedList<String> bolly,holly,tolly;
    MovieApp()
    {
        li.add(new Movie("Bahubali","2015","Hindi","Action","2014","Bollywood"));
        li.add(new Movie("FF9","2015","Hindi","Action","2015","Hollywood"));
        li.add(new Movie("Tamilki","2015","Tamil","Action","2015","Tollywood"));
        li.add(new Movie("Hindii","2015","Hindi","Action","2016","Bollywood"));
    }
    //Display the name of Movie and its Type
    void display()
     {
        System.out.println("Movie Name\tMovie Type");
        for(Movie data : li)
        {
           System.out.println(data.name+"\t"+data.MovieType);
        }
     }
     //Display the food available for each type 
     public void getfood(String MovieType)
     {
         
        foodType f = null;
        if(MovieType.equals("Tollywood"))
        {
             f = fd.Dosa;
        }
        else if(MovieType.equals("Bollywood"))
        {
             f = fd.Dal_Makhni;
        }
        else if(MovieType.equals("Hollywood"))
        {
            f = fd.Pepper_Stack;
        }
        else
        {
            f = null;
        }
        System.out.println(f);
    }
    //Display MovieList Type wise
    public void displayTypeWise()
    {
        bolly=new LinkedList<String>();
        holly=new LinkedList<String>();
        tolly=new LinkedList<String>();
        for(Movie data : li)
        {
            if(data.MovieType.equals("Bollywood"))
            {
                bolly.add(data.name);
            }
            else if(data.MovieType.equals("Hollywood"))
            {
                holly.add(data.name);
            }
            else if(data.MovieType.equals("Tollywood"))
            {
                tolly.add(data.name);
            }
        }
        System.out.println("<------Bollywood---->");
        for(String str : bolly)
        {
            System.out.println(str);
            isHit();
        }
        System.out.println("<------Hollywood---->");
        for(String str : holly)
        {
            System.out.println(str);
            isHit();
        }
        System.out.println("<------Tollywood---->");
        for(String str : tolly)
        {
            System.out.println(str);
            isHit();
        }
    }
    //Display is Movie hit 
    public void isHit()
    {
      //Movie data;
      Random rd = new Random();
      boolean b = rd.nextBoolean();
      String isBlockBuster = String.valueOf(b);
      System.out.println("Movie is a blockbuster:----->\t"+isBlockBuster+"\n");
    }
    //Display cost of production
    public void getCostOfProduction(String MovieType)
    {
        CostOfProduction tempCost = null;
        if(MovieType.equals("Tollywood"))
        {
            tempCost = CostOfProduction.Low;
        }
        else if(MovieType.equals("Bollywood"))
        {
            tempCost = CostOfProduction.Medium;
        }
        else if(MovieType.equals("Hollywood"))
        {
            tempCost = CostOfProduction.High;
        }
        else
        {
            tempCost = null;
        }
        System.out.println("The Cost Of Production will be:-"+tempCost);
    }
}