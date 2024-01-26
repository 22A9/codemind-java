import java.util.*;
public class Centimeters 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int height = obj.nextInt();
        double inches = height * 2.54;
        System.out.format("%.2f",inches);
    }
}