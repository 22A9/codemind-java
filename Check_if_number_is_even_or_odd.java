import java.util.*;
public class EvenOdd 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        
        int X = obj.nextInt();
        
        if (X % 2 == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}