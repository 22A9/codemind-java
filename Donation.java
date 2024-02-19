import java.util.*;
public class Donation {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        int X = obj.nextInt();
        int Y = obj.nextInt();
        
        int sum = (Y - X);
        
        System.out.print(sum);
    }
}