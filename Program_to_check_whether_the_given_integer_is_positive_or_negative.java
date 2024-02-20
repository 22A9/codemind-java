import java.util.*;
public class PositiveNegative 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        double N = obj.nextDouble();
        
        if(N < 0)
        {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Positive Number");
        }
    }
}