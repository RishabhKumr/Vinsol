import java.util.Scanner;
public class User
{
    public static void main(String args[])
    {
        //Movie data1;
        MovieApp mv = new MovieApp();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu--------");
        System.out.println("(1) Display All Movie List");
        System.out.println("(2) Display Typewise List");
        System.out.println("(3) Check the free food");
        int option = sc.nextInt();
        switch(option)
        {
            case 1: 
                mv.display();
                break;
            case 2:
                mv.displayTypeWise();
                break;
            case 3:
                System.out.println("Enter your choice to getfood:-");
                Scanner sc1 = new Scanner(System.in);
                String s = sc1.nextLine();
                mv.getfood(s);
                break;
        }
    }
}