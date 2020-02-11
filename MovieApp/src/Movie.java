public class Movie
{
    protected String name;
    protected String year;
    protected String language;
    protected String genre;
    protected String Releasedate;
    protected String MovieType;
    Movie()
    {
    }

    Movie(String name,String year,String language,String genre,String Releasedate,String MovieType)
    {
        this.name = name;
        this.year = year;
        this.language = language;
        this.genre = genre;
        this.Releasedate = Releasedate;
        this.MovieType = MovieType;
    }
    
}