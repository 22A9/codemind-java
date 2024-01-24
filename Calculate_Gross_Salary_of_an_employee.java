import java.util.*;
public class GS 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        double BS = obj.nextDouble();
        double HRA = obj.nextDouble();
        double DA = obj.nextDouble();
        double PF = 0.12 * BS;
        double GS = (BS+HRA+DA+PF);
        System.out.format("%.2f
",PF);
        System.out.format("%.2f",GS);
    }
}