import java.util.*;

public class DigitCount {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        
        int num = obj.nextInt();
        
        int count = 0;
        while(num > 0)
        {
            int rem = num % 10;
            num/= 10;
            count++;
        }
        System.out.print(count);
    }
}