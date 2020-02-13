import java.util.regex.Pattern;
public class RegexExample1
{
    public static void main(String args[])
    {
        Pattern p  = Pattern.compile("\\s");
        String[] s = p.split("Thi sis mme");
        for(String s1: s)
        {
                System.out.println(s1);
        }
    }
}