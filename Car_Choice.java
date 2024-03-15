import java.util.*;
public class CarChoise {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int t = obj.nextInt();
        for(int i=0;i<t;i++) 
        {
            int x1=obj.nextInt();
            int x2=obj.nextInt();
            int y1=obj.nextInt();
            int y2=obj.nextInt();
            
            double one = (double)y1/x1;
            double two = (double)y2/x2;
            
            
            if(one < two) {
                System.out.println(-1);
            }
            else if(one > two) {
                System.out.println(1);
            }
            else if(one == two || x1==y1 && x2==y2) {
                System.out.println(0);
            }
        }
    }
}