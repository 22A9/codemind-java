import java.util.*;
public class weight 

{
    public static void main(String[] args)
    
    {
        Scanner obj = new Scanner(System.in);
        int avg = obj.nextInt();
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = (avg*3)-a-b;
        System.out.println(c);
    }
}