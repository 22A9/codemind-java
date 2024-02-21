import java.util.*;
public class VowelConstant
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        
        char Ch = obj.next().charAt(0);
        
        if(Ch == 'a'||Ch == 'A'||Ch == 'e'||Ch == 'E'||Ch == 'i'||Ch == 'I'||Ch == 'o'||Ch == 'O'||Ch == 'u'|| Ch == 'U' )
        {
            System.out.println("Vowel");
        }
        else 
        {
            System.out.println("Consonant");
        }
    }
}