import java.util.*;
public class Maxofstring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int m=(int)s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(m<(int)s.charAt(i))
            {
                m=(int)s.charAt(i);
            }
        }
        System.out.println((char)m);
    }
}