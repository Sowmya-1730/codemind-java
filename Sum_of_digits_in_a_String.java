import java.util.*;
public class Statement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sm=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                sm=sm+Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(sm);
    }
}