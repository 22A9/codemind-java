import java.util.*;
public class Race 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int S = obj.nextInt();
        int B = obj.nextInt();
        int Capacity = T * S *B;
        
        System.out.println(Capacity + " KB");
    }
}