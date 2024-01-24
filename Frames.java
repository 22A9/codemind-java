import java.util.*;
public class frames 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int fail = c * 2*(a + b);
        System.out.println(fail);
    }
}