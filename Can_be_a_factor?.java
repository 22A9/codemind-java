import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t--> 0) {
            int a = obj.nextInt();
            int b = obj.nextInt();
            
            int z = b - a;
            if(z >= a || a == b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}