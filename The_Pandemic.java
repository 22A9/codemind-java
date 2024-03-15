import java.util.Scanner;

public class Pandemic {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int num = obj.nextInt();
        
        int result=0;
        if(num == 1) result=0;
        else if(num == 2)  result=1;
        else result = 2; 
    System.out.print(result);
}
}