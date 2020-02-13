import java.util.*;
class MovieApp
{   
    FoodType food;
    LinkedList<Movie> list = new LinkedList<Movie>();
    LinkedList<String> bollywood_list,hollywood_list,tollywood_list;
    MovieApp()
    {
        list.add(new Movie("Bahubali","2015","Hindi","Action","2014","Bollywood"));
        list.add(new Movie("FF9","2015","Hindi","Action","2015","Hollywood"));
        list.add(new Movie("Tamilki","2015","Tamil","Action","2015","Tollywood"));
        list.add(new Movie("Hindii","2015","Hindi","Action","2016","Bollywood"));
    }
    //Display the name of Movie and its Type
    void display()
     {
        System.out.println("Movie Name\tMovie Type");
        for(Movie data : list)
        {
           System.out.println(data.name+"\t"+data.movieType);
        }
     }
     //Display the food available for each type 
     public String getFood(String movieType)
     {
         
        FoodType tempFood = null;
        if(movieType.equals("Tollywood"))
        {
             tempFood = food.Dosa;
        }
        else if(movieType.equals("Bollywood"))
        {
             tempFood = food.Dal_Makhni;
        }
        else if(movieType.equals("Hollywood"))
        {
            tempFood = food.Pepper_Stack;
        }
        else
        {
            tempFood = null;
        }
        String food  = tempFood.toString();
	return food;
    }
    //Display MovieList Type wise
    public void displayTypeWise()
    {
        bollywood_list=new LinkedList<String>();
        hollywood_list=new LinkedList<String>();
        tollywood_list=new LinkedList<String>();
        for(Movie data : list)
        {
            if(data.movieType.equals("Bollywood"))
            {
                bollywood_list.add(data.name);
            }
            else if(data.movieType.equals("Hollywood"))
            {
                hollywood_list.add(data.name);
            }
            else if(data.movieType.equals("Tollywood"))
            {
                tollywood_list.add(data.name);
            }
        }
        System.out.println("<------Bollywood---->");
        for(String str : bollywood_list)
        {
            System.out.println(str);
            isHit();
        }
        System.out.println("<------Hollywood---->");
        for(String str : hollywood_list)
        {
            System.out.println(str);
            isHit();
        }
        System.out.println("<------Tollywood---->");
        for(String str : tollywood_list)
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
      boolean bool = rd.nextBoolean();
      String isBlockBuster = String.valueOf(bool);
      System.out.println("Movie is a blockbuster:----->\t"+isBlockBuster+"\n");
    }
    //Display cost of production
    public void getCostOfProduction(String movieType)
    {
        CostOfProduction tempCost = null;
        if(movieType.equals("Tollywood"))
        {
            tempCost = CostOfProduction.Low;
        }
        else if(movieType.equals("Bollywood"))
        {
            tempCost = CostOfProduction.Medium;
        }
        else if(movieType.equals("Hollywood"))
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
