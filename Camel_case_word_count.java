import java.util.*;
public class Camelcase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        for(int i=1;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                c++;
            }
        }
        System.out.println(c+1);
    }
}