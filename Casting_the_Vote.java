import java.util.*;
public class Voting 
{
    public static void main(String[] args)
    {
        int age,diff;
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        
        if(age>=18)
        {
            System.out.println("YES");
        }
        else 
        {
            diff = (18-age);
            System.out.println("NO");
        }
    }
}