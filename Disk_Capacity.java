import java.util.*;
public class Disk
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int S = obj.nextInt();
        int B = obj.nextInt();
        int Capacity = T * S * B * 512 * 2;
        System.out.println(Capacity);
    }
}