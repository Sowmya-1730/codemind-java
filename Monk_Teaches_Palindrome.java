import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            String rev="";
            for (int j=0; j<s.length();j++) 
            {
                rev= s.charAt(j) + rev;
            }
            if(s.equals(rev))
            {
                if(s.length()%2==0)
                {
                    System.out.println("YES EVEN");
                }
                else
                {
                    System.out.println("YES ODD");
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}