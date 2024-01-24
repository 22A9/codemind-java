import java.util.*;
public class Triangle 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        
        double s = (a+b+c)/2.0;
        double area = Math.sqrt (s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}