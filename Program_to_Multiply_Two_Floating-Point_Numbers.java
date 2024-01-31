import java.io.*;
import java.util.Scanner;
public class PointNumbers
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        double Num1 = obj.nextDouble();
        double Num2 = obj.nextDouble();
        double product;
        product = Num1 * Num2;
        System.out.format("%.2f",product);
}
}