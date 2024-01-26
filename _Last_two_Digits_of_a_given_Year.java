import java.util.*;
public class LastTwo 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int year = obj.nextInt();
        int lastTwoDigits = year % 100;
        if(lastTwoDigits < 10){
            System.out.println("0"+lastTwoDigits);
        }
        else {
            System.out.println(lastTwoDigits);
        }
        
    }
}