import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CandidateCode {
    /*
   public int getit(String s,String m)
   {
      int count = 0;
      if(s.contains(m))
      {
         count++;
      }
     return count;
   }
   */
   
   public static void main(String args[] ) throws Exception {
       int count=0;
   CandidateCode c = new CandidateCode();
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   String m = sc.nextLine();
   Pattern p = Pattern.compile(m);
   Matcher match = p.matcher(s);
   while(match.find())
   {
       count++;
    }
    System.out.print(count);
}
}
   
   
