import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexExample
{
    public static void main(String args[])
    {
      Pattern p = Pattern.compile("\\s");
      Matcher m = p.matcher("This is a java");
      while(m.find())
      {
          System.out.println("\t"+m.start()+"\t"+m.end()+"\t"+m.group());
        }
    }
}