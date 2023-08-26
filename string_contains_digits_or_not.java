import java.util.*;
public class Digit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                if(Character.isDigit(s.charAt(j)))
                {
                    c++;
                }
            }
            if(c!=0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}