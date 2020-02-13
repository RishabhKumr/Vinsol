import java.util.*;
class MovieApp
{   
    FoodType food;
    LinkedList<Movie> list = new LinkedList<Movie>();
    LinkedList<String> bollywood,hollywood,tollywood;
    Random random = new Random();
    MovieApp()
    {
        list.add(new Movie("Bahubali","2015","Hindi","Action","2014","Bollywood",random.nextBoolean()));
        list.add(new Movie("FF9","2015","Hindi","Action","2015","Hollywood",random.nextBoolean()));
        list.add(new Movie("Tamilki","2015","Tamil","Action","2015","Tollywood",random.nextBoolean()));
        list.add(new Movie("Hindii","2015","Hindi","Action","2016","Bollywood",random.nextBoolean()));
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
        bollywood=new LinkedList<String>();
        hollywood=new LinkedList<String>();
        tollywood=new LinkedList<String>();
        for(Movie data : list)
        {
            if(data.movieType.equals("Bollywood"))
            {
                bollywood.add(data.name);
            }
            else if(data.movieType.equals("Hollywood"))
            {
                hollywood.add(data.name);
            }
            else if(data.movieType.equals("Tollywood"))
            {
                tollywood.add(data.name);
            }
        }
        System.out.println("<------Bollywood---->");
        for(String str : bollywood)
        {
            System.out.println(str);
        }
        System.out.println("<------Hollywood---->");
        for(String str : hollywood)
        {
            System.out.println(str);
            
        }
        System.out.println("<------Tollywood---->");
        for(String str : tollywood)
        {
            System.out.println(str);
        }
    }
    //Display is Movie hit 
    public void isBlockBuster()
    {
        System.out.println("<------Blockbuster------>");
        for(Movie data : list)
        {
             System.out.println(data.name+"\t"+data.blockbuster);
        }
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
