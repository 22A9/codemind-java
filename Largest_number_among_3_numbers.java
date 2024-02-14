import java.util.*;

public class SaiHero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max1 = Math.max(a,b);
        int max = Math.max(max1 , c);
        
        System.out.print(max);
    }
}