import java.util.*;
public class DragonFruit
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        if(X%2==0 && X>2)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}