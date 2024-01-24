import java.util.*;
public class Pass 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int kmp = obj.nextInt();
        double meters = (kmp * 5) / 18.0;
        System.out.format("%.2f",meters);
    }
}