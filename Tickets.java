import java.util.*;
public class Tickets 
{
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        int totalCost = X * 4;
        
        if(totalCost <=1000) 
        {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}