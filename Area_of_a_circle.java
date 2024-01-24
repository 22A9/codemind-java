import java.util.*;
public class circle 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int r = obj.nextInt();
        double area = (3.14) * r * r;
        System.out.format("%.2f",area);
    }
}