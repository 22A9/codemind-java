import java.util.*;
public class GoodOrBad
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        int X = obj.nextInt();
        int Y = obj.nextInt();
        
        if(X >= 2 * Y)
        {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
    }
}