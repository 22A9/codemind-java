import java.util.*;
public class SquareSum {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int sideLength = obj.nextInt();
        int area = sideLength * sideLength;
        int perimeter = 4 * sideLength;
        System.out.print(area + " "+ perimeter);
        
    }
}