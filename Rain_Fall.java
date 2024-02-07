import java.util.*;
public class RainFall
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        if(x < 3) System.out.println("LIGHT");
        else if(x >= 3 && x < 7) System.out.println("MODERATE");
else if(x >= 7) System.out.println("HEAVY");
    }
 
}
