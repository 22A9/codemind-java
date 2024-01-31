import java.util.*;
public class  Triangle
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        int z = obj.nextInt();
        Double s = (x+y+z)/2.0;
        Double area;
        area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.format("%.2f",area);
    }
}