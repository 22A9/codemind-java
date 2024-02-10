import java.util.*;
public class DaysToYearsWeeks
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int days = obj.nextInt();
        
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        
        System.out.println(years);
        System.out.println(weeks);
    }
}