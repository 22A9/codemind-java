import java.util.*;

public class ReachHome 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        int x = obj.nextInt();
        int y = obj.nextInt();
        
        if(x * 5 >= y)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}