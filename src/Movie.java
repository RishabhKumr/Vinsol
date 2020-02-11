public class Movie
{
    protected String name;
    protected String year;
    protected String language;
    protected String genre;
    protected String Rdate;
    protected String MovieType;
    Movie()
    {
    }
    Movie(String n,String y,String l,String g,String Rd,String mt)
    {
        name = n;
        year = y;
        language = l;
        genre = g;
        Rdate = Rd;
        MovieType = mt;
    }
}