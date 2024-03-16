import java.util.*;

public class FindFactor {
    
    public static void main(String[] args)  {
        
       Scanner obj = new Scanner(System.in);
       
       int num = obj.nextInt();
       
       int i=1;
       while(i <= num) {
           
           if(num % i == 0) {
               System.out.print(i+" ");
           }
           
           i++;
       }
}
}