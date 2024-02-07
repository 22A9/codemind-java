import java.util.*;
public class Fever 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int X = obj.nextInt();
        if(X>98)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}