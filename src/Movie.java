public class Movie
{
    protected String name;
    protected String year;
    protected String language;
    protected String genre;
    protected String releaseDate;
    protected String movieType;
    boolean blockbuster;
    Movie()
    {
    }
 
    Movie(String name,String year,String language,String genre,String releaseDate,String movieType,boolean blockbuster)
    {
        this.name = name;
        this.year = year;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.movieType = movieType;
        this.blockbuster = blockbuster;
    }
    
}